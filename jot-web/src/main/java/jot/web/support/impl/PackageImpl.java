package jot.web.support.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jot.web.conf.JPackage;
import jot.web.conf.JApp;
import jot.web.context.ActionContext;
import jot.web.context.PackageCenter;
import jot.web.support.ActionInvoke;
import jot.web.support.ExceptionHandler;
import jot.web.support.Interceptor;
import jot.web.support.Package;
import jot.web.support.Service;

public class PackageImpl implements Package {

	private JApp jPackages;

	private JPackage jPackage;

	private PackageCenter packageCenter;

	private Package superPackage;

	/**
	 * key = uri value = invoke
	 */
	private Map<String, ActionInvoke> actionInvokeMap = new HashMap<>();

	private Map<String, Service> serviceMap = new HashMap<>();

	private List<Interceptor> interceptors = new ArrayList<>();

	private Map<String, Class<ExceptionHandler>> exceptionHandlerMap = new HashMap<>();

	public PackageImpl(JApp jPackages, String pkgName,
			PackageCenter packageCenter) {
		this.jPackages = jPackages;
		this.packageCenter = packageCenter;
//		this.jPackage = jPackages.getJPackage(pkgName);
		packageCenter.put(pkgName, this);
		init();
	}

	private boolean hasSuperPackage() {
		String extend = jPackage.getExtends();
		return extend != null && !extend.trim().equals("");
	}

	protected void init() {
		if (hasSuperPackage()) {
			String extend = jPackage.getExtends().trim();
			if (!packageCenter.contain(extend)) {
				superPackage = new PackageImpl(jPackages, extend, packageCenter);
			}
		}

		initExceptionHandlerMap();
		initInterceptorMap();
		initServices();
		initActions();
	}

	protected void initExceptionHandlerMap() {
		this.exceptionHandlerMap.clear();
		jPackage.getExceptionHandlerMap();
	}

	protected void initInterceptorMap() {
		this.interceptors.clear();
		jPackage.getInterceptorMap();
	}

	protected void initServices() {
		this.serviceMap.clear();
		jPackage.getServices();
	}

	protected void initActions() {
		this.actionInvokeMap.clear();
		jPackage.getActions();
	}

	@Override
	public JPackage getJPackage() {
		return jPackage;
	}

	@Override
	public boolean contain(String uri) {
		boolean c = this.actionInvokeMap.containsKey(uri);
		if (!c) {
			if (this.hasSuperPackage()) {
				return superPackage.contain(uri);
			}
		}
		return c;
	}

	@Override
	public Object invokeAction(String uri,ActionContext context) {
		boolean c = this.actionInvokeMap.containsKey(uri);
		if (c) {
			try {
				ActionInvoke invoke = actionInvokeMap.get(uri);
				for (Interceptor inter : this.interceptors) {
					inter.before();
				}
				Object result = invoke.invokeAction();
				for (Interceptor inter : this.interceptors) {
					inter.after();
				}
				return result;
			} catch (Exception e) {
				String exceptionName = e.getClass().getName();
				ExceptionHandler handler = null;
				if (this.exceptionHandlerMap.containsKey(exceptionName)) {
					try {
						handler = exceptionHandlerMap.get(exceptionName)
								.newInstance();
					} catch (InstantiationException e1) {
						e1.printStackTrace();
					} catch (IllegalAccessException e1) {
						e1.printStackTrace();
					}
				} else {
					handler = new UnknownExceptionHandler();
				}
				handler.setException(e);
				return handler;
			}
		} else {
			if (this.hasSuperPackage()) {
				return superPackage.invokeAction(uri, context);
			}
		}
		return null;
	}

}
