package jot.web.engine;

import java.io.File;

import jot.model.project.Package;

public class PackageEngine {

	private Package packageResource;

	private File pkgFile;
	
	private jot.model.package_.Package pkg ;
	
	private ProjectEngine parent;

	public PackageEngine(Package packageResource) {
		this.packageResource = packageResource;
		reload();
	}

	public void reload(){
		
	}
	
	public String getNamespace() {
		return pkg.getNamespace();
	}
	
	public void setParent(ProjectEngine parent) {
		this.parent = parent;
	}
	

}
