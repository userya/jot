package jot.web.engine;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jot.exception.BaseException;
import jot.loader.JotClassLoader;
import jot.model.projects.Project;
import jot.utils.ClassUtils;
import jot.web.engine.conf.ProjectLoader;

import org.apache.commons.io.FilenameUtils;

public class ProjectEngine {

	private ProjectLoader projectLoader = new ProjectLoader();

	private Project projectResource;

	private jot.model.project.Project project;

	private File projectFile;

	private URL projectClassPath;

	private JotClassLoader classLoader;

	private Map<String, PackageEngine> pkgEngineMap = new HashMap<String, PackageEngine>();

	public ProjectEngine(Project projectResource) {
		this.projectResource = projectResource;
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

	}

	public void reloadProject() {
		pkgEngineMap.clear();
		if (project == null || project.getPackage() == null) {
			return;
		}
		for (jot.model.project.Package pkg : project.getPackage()) {
			PackageEngine pkgEngine = new PackageEngine(pkg);
			pkgEngine.setParent(this);
			pkgEngineMap.put(pkgEngine.getNamespace(), pkgEngine);
		}
	}

	public JotClassLoader getProjectClassLoader() {
		return this.classLoader;
	}

	public JotClassLoader createProjectClassLoader() {
		return new JotClassLoader(projectClassPath);
	}

	public void invoke(HttpServletRequest request, HttpServletResponse response){
		
	}
	
}
