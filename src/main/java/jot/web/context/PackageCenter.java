package jot.web.context;

import java.util.HashMap;
import java.util.Map;

import jot.web.support.Package;
import jot.web.support.ViewResolver;

public class PackageCenter {

	private Map<String, Package> packageMap = new HashMap<>();

	private ViewResolver viewResolver;

	public void put(String name, Package pkg) {
		packageMap.put(name, pkg);
	}

	public Package get(String name) {
		return packageMap.get(name);
	}

	public boolean contain(String name) {
		return packageMap.containsKey(name);
	}

	public void invoke(String uri) {
		int index = uri.indexOf(".");
		if (index > -1) {
			String packageNamespace = uri.substring(0, index);
			if (packageMap.containsKey(packageNamespace)) {
				Package pkg = packageMap.get(packageNamespace);
				Object result = pkg.invokeAction(uri);
				viewResolver.render(result);
			} else {
				//404
			}
		}
		//首页
	}

}
