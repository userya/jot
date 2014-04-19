package jot.web.engine;

import java.io.File;
import java.net.URL;

import jot.model.project.Package;
import jot.web.engine.conf.PackageLoader;

public class PackageEngine {

	private PackageLoader pkgLoader = new PackageLoader();

	private Package packageResource;

	private File pkgFile;

	private jot.model.package_.Package pkg;

	private ProjectEngine parent;

	public PackageEngine(Package packageResource) {
		this.packageResource = packageResource;
		loadResource();
	}
	
	public void loadResource(){
		URL url = parent.getProjectClassLoader().getResource(packageResource.getResource());
		pkgFile = new File(url.getFile());
		pkg = pkgLoader.load(url);
	}

	public void reload() {
		URL url = parent.getProjectClassLoader().getResource(packageResource.getResource());
		String f = url.getFile();
		pkgFile = new File(f);
		pkg = pkgLoader.load(url);
		String extendsPkg = pkg.getExtends();
		
	}

	public String getNamespace() {
		return pkg.getNamespace();
	}

	public void setParent(ProjectEngine parent) {
		this.parent = parent;
	}

}
