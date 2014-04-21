package jot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import jot.model.package_.Action;
import jot.model.package_.Actions;
import jot.model.package_.PackageFactory;
import jot.model.project.Package;
import jot.model.project.ProjectFactory;
import jot.model.projects.Project;
import jot.model.projects.Projects;
import jot.model.projects.ProjectsFactory;
import jot.model.writer.EMFXmlWriter;
import junit.framework.TestCase;

public class ModelGenTest extends TestCase {

	public void testGenProjects() throws IOException{
		Projects p = ProjectsFactory.eINSTANCE.createProjects();
		Project p1 = ProjectsFactory.eINSTANCE.createProject();
		p1.setName("test");
		p1.setNamespace("a");
		p1.setResource("../aa./d/");
		p.getProject().add(p1);
		File file = File.createTempFile("tmp", ".xml");
		EMFXmlWriter.writer(p, file.getPath());
		String f = FileUtils.readFileToString(file);
		System.out.println(f);
	}
	
	
	public void testGenProject() throws IOException {
		jot.model.project.Project p = ProjectFactory.eINSTANCE.createProject();
		Package pkg = ProjectFactory.eINSTANCE.createPackage();
		pkg.setName("test");
		pkg.setResource("aaa");
		p.getPackage().add(pkg);
		File file = File.createTempFile("tmp", ".xml");
		EMFXmlWriter.writer(p, file.getPath());
		String f = FileUtils.readFileToString(file);
		System.out.println(f);
	}
	
	
	public void testGenPackage() throws IOException {
		jot.model.package_.Package p = PackageFactory.eINSTANCE.createPackage();
		p.setName("test");
		Action ac = PackageFactory.eINSTANCE.createAction();
		
		Actions acs = PackageFactory.eINSTANCE.createActions();
		p.setActions(acs);
		
		ac.setName("aa");
		ac.setMethod("aa");
		p.getActions().getAction().add(ac);
		
		Action ac1 = PackageFactory.eINSTANCE.createAction();
		ac1.setName("aa1");
		ac1.setMethod("aa1");
		p.getActions().getAction().add(ac1);
		
		File file = File.createTempFile("tmp", ".xml");
		EMFXmlWriter.writer(p, file.getPath());
		String f = FileUtils.readFileToString(file);
		System.out.println(f);
	}
}
