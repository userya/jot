package jot.web.engine;

import java.io.File;
import java.net.URL;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import jot.exception.BaseException;
import jot.loader.JotClassLoader;
import jot.model.package_.Action;
import jot.model.package_.ExceptionMapping;
import jot.model.package_.Interceptor;
import jot.model.package_.Service;
import jot.model.project.Package;
import jot.web.engine.conf.PackageLoader;
import jot.web.support.ActionContext;
import jot.web.support.ActionInvoke;
import jot.web.support.ExceptionHandler;
import jot.web.support.HttpStatusCode;
import jot.web.support.Inject;
import jot.web.support.impl.ActionInvokeImpl;
import jot.web.support.impl.UnknownExceptionHandler;

import org.eclipse.emf.common.util.EList;

public class PackageEngine {

	private PackageLoader pkgLoader = new PackageLoader();

	private Package packageResource;

	private jot.model.package_.Package pkg;

	private ProjectEngine project;

	private JotClassLoader classLoader;

	private Set<File> files = new HashSet<File>();

	private Map<String, jot.web.support.Interceptor> interceptors = new LinkedHashMap<String, jot.web.support.Interceptor>();
	private Map<String, Class<ExceptionHandler>> exceptionMappings = new LinkedHashMap<String, Class<ExceptionHandler>>();

	private Map<String, jot.web.support.ActionInvoke> actions = new HashMap<String, jot.web.support.ActionInvoke>();
	private Map<String, jot.web.support.Service> services = new HashMap<String, jot.web.support.Service>();

	public PackageEngine(Package packageResource) {
		this.packageResource = packageResource;
		loadResource();
	}

	public void loadResource() {
		URL url = project.getProjectClassLoader().getResource(packageResource.getResource());
		pkg = pkgLoader.load(url);
		files.add(new File(url.getFile()));
	}

	public void reload() {
		classLoader = project.createProjectClassLoader();

		files.clear();

		loadInterceptor();
		loadExceptionMapping();
		loadServices();
		loadActions();
		injectActionService();
	}

	protected File getClassFile(String className) {
		String name = className.replace('.', '/') + ".class";
		name = project.getClassPathFileName() + name;
		File file = new File(name);
		return file;
	}

	protected void addClassFile(String className) {
		this.files.add(getClassFile(className));
	}

	protected Object newInstance(String className) {

		try {
			return classLoader.loadClass(className).newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
			throw new BaseException(e);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
			throw new BaseException(e);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			throw new BaseException(e);
		}
	}

	protected void loadInterceptor() {
		interceptors.clear();
		EList<Interceptor> list = pkg.getInterceptors();
		if (list != null) {
			for (Interceptor interceptor : list) {
				String name = interceptor.getName();
				String clazz = interceptor.getClass_();
				Object obj = newInstance(clazz);
				if (obj instanceof jot.web.support.Interceptor) {
					jot.web.support.Interceptor inter = (jot.web.support.Interceptor) obj;
					interceptors.put(name, inter);
				} else {
					throw new BaseException("interceptor type error, must be implement [jot.web.support.Interceptor]");
				}
				addClassFile(clazz);
			}
		}
	}

	protected void loadExceptionMapping() {
		exceptionMappings.clear();
		EList<ExceptionMapping> list = pkg.getExceptionMapping();
		if (list != null) {
			for (ExceptionMapping mp : list) {
				String cname = mp.getClass_();
				Class<?> c;
				try {
					c = classLoader.loadClass(cname);
					if (c.isInstance(Interceptor.class)) {
						Class<ExceptionHandler> cc = (Class<ExceptionHandler>) c;
						exceptionMappings.put(mp.getName(), cc);
					} else {
						throw new BaseException("ExceptionMapping type error, must be implement [jot.web.support.ExceptionHandler]");
					}
				} catch (ClassNotFoundException e) {
					throw new BaseException(e);
				}
				addClassFile(mp.getClass_());
			}
		}
	}

	protected void loadActions() {
		actions.clear();
		EList<Action> list = pkg.getActions();
		if (list != null) {
			for (Action mp : list) {
				Object obj = newInstance(mp.getClass_());
				if (obj instanceof jot.web.support.Action) {
					jot.web.support.Action ha = (jot.web.support.Action) obj;
					ActionInvoke invoke = new ActionInvokeImpl(ha, mp.getMethod());
					actions.put(mp.getName(), invoke);
				} else {
					throw new BaseException("ExceptionMapping type error, must be implement [jot.web.support.Action]");
				}
				addClassFile(mp.getClass_());
			}
		}
	}

	protected void loadServices() {
		services.clear();
		EList<Service> list = pkg.getServices();
		if (list != null) {
			for (Service mp : list) {
				Object obj = newInstance(mp.getClass_());
				if (obj instanceof jot.web.support.Service) {
					jot.web.support.Service ha = (jot.web.support.Service) obj;
					services.put(mp.getName(), ha);
				} else {
					throw new BaseException("ExceptionMapping type error, must be implement [jot.web.support.Action]");
				}
				addClassFile(mp.getClass_());
			}
		}
	}

	public void injectActionService() {
		for (jot.web.support.ActionInvoke action : this.actions.values()) {
			action.getClass().getAnnotation(Inject.class);
			// TODO injection

		}

		for (jot.web.support.Service service : services.values()) {
			service.getClass().getAnnotation(Inject.class);
			// TODO injection
		}
	}

	public String getNamespace() {
		return pkg.getNamespace();
	}

	public void setProject(ProjectEngine project) {
		this.project = project;
	}

	public Set<File> getFiles() {
		return files;
	}

	public Object invoke(String actionPath, ActionContext context) {
		if (this.actions.containsKey(actionPath)) {
			jot.web.support.ActionInvoke action = actions.get(actionPath);
			return invoke(action, context);
		} else {
			// not found try parent action
			String extend = this.pkg.getExtends();
			if (project.getPkgEngineKeyWithNameMap().containsKey(extend)) {
				PackageEngine engine = project.getPkgEngineKeyWithNameMap().get(extend);
				return engine.invoke(actionPath, context);
			} else {
				// real not found
				return HttpStatusCode.Code404;
			}
		}
	}

	protected Object invoke(jot.web.support.ActionInvoke action, ActionContext context) {
		Object result = null;
		try {
			for (jot.web.support.Interceptor inter : this.interceptors.values()) {
				boolean pass = inter.before();
				if(!pass) {
					// return
				}
			}
			
			result = action.invokeAction(context);
			
			for (jot.web.support.Interceptor inter : this.interceptors.values()) {
				inter.after();
			}
		} catch (Exception e) {
			result = processException(e);
		}
		return result;
	}
	
	

	protected Object getUnknownExceptionHandler(Exception e) {
		UnknownExceptionHandler ue = new UnknownExceptionHandler();
		ue.setException(e);
		return ue;
	}

	protected Object processException(Exception e) {
		if (this.exceptionMappings.values().contains(e.getClass())) {
			for (Class<ExceptionHandler> eh : this.exceptionMappings.values()) {
				if (eh.equals(e.getClass())) {
					try {
						ExceptionHandler handler = eh.newInstance();
						handler.setException(e);
						return handler;
					} catch (InstantiationException e1) {
						e1.printStackTrace();
						throw new BaseException(e1);
					} catch (IllegalAccessException e1) {
						e1.printStackTrace();
						throw new BaseException(e1);
					}
				}
			}
			return getUnknownExceptionHandler(e);
		} else {
			String extend = this.pkg.getExtends();
			if (project.getPkgEngineKeyWithNameMap().containsKey(extend)) {
				PackageEngine engine = project.getPkgEngineKeyWithNameMap().get(extend);
				return engine.processException(e);
			} else {
				return getUnknownExceptionHandler(e);
			}
		}

	}

}
