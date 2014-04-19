package jot.web.engine;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.monitor.FileAlterationListenerAdaptor;
import org.apache.commons.io.monitor.FileAlterationMonitor;
import org.apache.commons.io.monitor.FileAlterationObserver;

import jot.exception.BaseException;
import jot.model.projects.Project;
import jot.model.projects.Projects;
import jot.utils.ResourceUtils;
import jot.web.engine.conf.ProjectsLoader;

public class ProjectsEngine {

	private ProjectsLoader loader = new ProjectsLoader();

	private File projectsXML;

	private Projects projects;

	private Map<String, ProjectEngine> projectMap = new HashMap<String, ProjectEngine>();

	private FileAlterationMonitor fileMonitor;

	public ProjectsEngine() {
		reload();
		startMonitor();
	}

	public void reload() {
		try {
			projectsXML = ResourceUtils.getFile("classpath:projects.xml");
		} catch (FileNotFoundException e) {
			throw new BaseException(e);
		}
		try {
			projects = loader.load(projectsXML.toURI().toURL());
		} catch (MalformedURLException e) {
			throw new BaseException(e);
		}
	}

	public void reloadProject() {
		projectMap.clear();
		if (projects == null || projects.getProject() == null || projects.getProject().isEmpty()) {
			return;
		}
		for (int i = 0; i < projects.getProject().size(); i++) {
			Project prj = projects.getProject().get(i);
			String namespace = prj.getNamespace();
			ProjectEngine pengine = new ProjectEngine(prj);
			this.projectMap.put(namespace, pengine);
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
		FileAlterationObserver observer = new FileAlterationObserver(projectsXML.getParentFile());
		fileMonitor.addObserver(observer);
		observer.addListener(new FileAlterationListenerAdaptor() {
			@Override
			public void onFileChange(File file) {
				if (projectsXML.equals(file)) {
					reload();
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

	public void invoke(HttpServletRequest request, HttpServletResponse response) {
		String uri = request.getRequestURI();
		int firstIndex = uri.indexOf("/");
		if (firstIndex > -1) {
			String p = uri.substring(0, firstIndex);
			if (this.projectMap.containsKey(p)) {
				projectMap.get(p).invoke(request, response);
			}
		}
	}

}
