package jot.web.engine.conf;

import java.net.URL;

import jot.model.projects.Projects;
import jot.model.projects.ProjectsPackage;
import jot.model.reader.EMFXmlReader;

public class ProjectsLoader  {

	public Projects load(URL path) {
		return EMFXmlReader.reader(path, Projects.class, ProjectsPackage.eINSTANCE);
	}

}
