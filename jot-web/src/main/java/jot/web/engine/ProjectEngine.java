package jot.web.engine;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import jot.exception.BaseException;
import jot.loader.JotClassLoader;
import jot.model.projects.Project;
import jot.utils.ClassUtils;
import jot.web.engine.conf.ProjectLoader;
import jot.web.support.ActionContext;
import jot.web.support.HttpStatusCode;
import jot.web.support.ViewResolver;
import jot.web.support.impl.ViewResolverImpl;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.monitor.FileAlterationListenerAdaptor;
import org.apache.commons.io.monitor.FileAlterationMonitor;
import org.apache.commons.io.monitor.FileAlterationObserver;

public class ProjectEngine {

	private ProjectLoader projectLoader = new ProjectLoader();

	private Project projectResource;

	private FileAlterationMonitor fileMonitor;

	private jot.model.project.Project project;

	private File projectFile;

	private URL projectClassPath;

	private JotClassLoader classLoader;

	/**
	 * key=> namespace
	 */
	private Map<String, PackageEngine> pkgEngineMap = new HashMap<String, PackageEngine>();

	private Map<String, PackageEngine> pkgEngineKeyWithNameMap = new HashMap<String, PackageEngine>();

	private Map<File, List<PackageEngine>> monitorFile = new HashMap<File, List<PackageEngine>>();
	
	private ViewResolver viewResolver = new ViewResolverImpl();
	

	public ProjectEngine(Project projectResource) {
		this.projectResource = projectResource;
	}

	public String getClassPathFileName() {
		return projectClassPath.getFile();
	}

	public void registPackageFileMonitor(PackageEngine engine) {
		// clear
		for (File file : monitorFile.keySet()) {
			List<PackageEngine> list = monitorFile.get(file);
			List<PackageEngine> toRemove = new ArrayList<PackageEngine>();
			for (PackageEngine packageEngine : list) {
				if (engine.getNamespace().equals(packageEngine.getNamespace())) {
					toRemove.add(packageEngine);
				}
			}
			list.removeAll(toRemove);
		}
		Set<File> files = engine.getFiles();
		for (File file : files) {
			if (!monitorFile.containsKey(file)) {
				monitorFile.put(file, new ArrayList<PackageEngine>());

			}
			monitorFile.get(file).add(engine);
		}
	}

	public void reload() {
		String resource = projectResource.getResource();
		File file = new File(resource);
		if (!file.exists()) {
			URL url = ClassUtils.getDefaultClassLoader().getResource("");
			String p = url.getFile() + resource;
			String f = FilenameUtils.normalize(p);
			file = new File(f);
		}
		if (!file.exists()) {
			throw new BaseException("can not load " + resource);
		}
		projectFile = file;
		try {
			project = projectLoader.load(projectFile.toURI().toURL());
		} catch (MalformedURLException e) {
			throw new BaseException(e);
		}
		try {
			URL url = projectFile.getParentFile().toURI().toURL();
			if (url.getPath().indexOf("/classes/") > -1) {
				url = new File(url.getPath().substring(0, url.getPath().indexOf("/classes/") + "/classes/".length())).toURI().toURL();
			}
			projectClassPath = url;
			classLoader = new JotClassLoader(projectClassPath);
		} catch (Exception e) {
			throw new BaseException(e);
		}

		reloadProject();
		startMonitor();
	}

	public void reloadProject() {
		pkgEngineMap.clear();
		pkgEngineKeyWithNameMap.clear();
		if (project == null || project.getPackage() == null) {
			return;
		}
		for (jot.model.project.Package pkg : project.getPackage()) {
			PackageEngine pkgEngine = new PackageEngine(pkg);
			pkgEngine.setProject(this);
			pkgEngineMap.put(pkgEngine.getNamespace(), pkgEngine);

		}
		for (PackageEngine engine : pkgEngineMap.values()) {
			engine.reload();
			registPackageFileMonitor(engine);
		}
	}

	public void startMonitor() {
		if (fileMonitor != null) {
			try {
				fileMonitor.stop();
			} catch (Exception e) {
				e.printStackTrace();
				throw new BaseException(e);
			}
		}
		fileMonitor = new FileAlterationMonitor(2000);
		FileAlterationObserver observer = new FileAlterationObserver(projectFile.getParentFile());
		fileMonitor.addObserver(observer);
		observer.addListener(new FileAlterationListenerAdaptor() {
			@Override
			public void onFileChange(File file) {
				if (projectFile.equals(file)) {
					reload();
				} else {
					if (monitorFile.containsKey(file)) {
						List<PackageEngine> pes = monitorFile.get(file);
						for (PackageEngine packageEngine : pes) {
							packageEngine.loadResource();
							packageEngine.reload();
						}
					}
				}
			}
		});
		try {
			fileMonitor.start();
		} catch (Exception e) {
			e.printStackTrace();
			throw new BaseException(e);
		}
	}

	public void stopMonitor() {
		if (fileMonitor != null) {
			try {
				fileMonitor.stop();
			} catch (Exception e) {
				throw new BaseException(e);
			}
		}
	}

	public JotClassLoader getProjectClassLoader() {
		return this.classLoader;
	}

	public JotClassLoader createProjectClassLoader() {
		return new JotClassLoader(projectClassPath);
	}

	public void invoke(String path, ActionContext context) {
		int first = path.indexOf("/");
		String namespace = path.substring(0, first);
		Object result = null;
		if (pkgEngineMap.containsKey(namespace)) {
			PackageEngine engine = pkgEngineMap.get(namespace);
			String action = path.substring(first);
			result = engine.invoke(action,context);
		} else {
			// not found.
			result = HttpStatusCode.Code404;
		}
		viewResolver.render(result, context);
	}

	public Map<String, PackageEngine> getPkgEngineKeyWithNameMap() {
		return pkgEngineKeyWithNameMap;
	}

	public void setPkgEngineKeyWithNameMap(Map<String, PackageEngine> pkgEngineKeyWithNameMap) {
		this.pkgEngineKeyWithNameMap = pkgEngineKeyWithNameMap;
	}

}
