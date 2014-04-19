package jot.web.engine.conf;

import java.net.URL;

import jot.model.project.Project;
import jot.model.project.ProjectPackage;
import jot.model.reader.EMFXmlReader;

public class ProjectLoader {

	public Project load(URL path) {
		return EMFXmlReader.reader(path, Project.class,
				ProjectPackage.eINSTANCE);

	}

}
