package jot.web.context;

import java.util.HashMap;
import java.util.Map;

import jot.web.support.Package;

public class PackageCenter {

	private Map<String, Package> packageMap = new HashMap<>();

	public void put(String name, Package pkg) {
		packageMap.put(name, pkg);
	}

	public Package get(String name) {
		return packageMap.get(name);
	}

	public boolean contain(String name) {
		return packageMap.containsKey(name);
	}

}
