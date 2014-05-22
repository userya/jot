package jot;

import java.util.Map;

import jot.model.projects.Project;
import jot.model.projects.Projects;
import jot.model.projects.ProjectsFactory;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class ModelReaderTest {

	public void testReader() {
		/*
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("xml", new XMIResourceFactoryImpl());
		InputStream inputStream = null;
		String classPath = "config/fixflowconfig.xml";
		URL url = this.getClass().getClassLoader().getResource(classPath);
		if (url == null) {
			System.out.println("");
		}
		String filePath = url.toString();
		Resource resource = null;
		try {
			// 判断xml是否在jar中
			if (!filePath.startsWith("jar")) {
				filePath = java.net.URLDecoder.decode(
						ReflectUtil.getResource(classPath).getFile(), "utf-8");
				resource = resourceSet.createResource(URI
						.createFileURI(filePath));
			} else {
				resource = resourceSet.createResource(URI.createURI(filePath));
			}
			// CoreconfigPackage 是自己模型的package
			resourceSet.getPackageRegistry().put(
					CoreconfigPackage.eINSTANCE.getNsURI(),
					CoreconfigPackage.eINSTANCE);
			resource.load(null);
		} catch (Exception e) {
			log.error("fixflowconfig.xml文件加载失败", e);
			throw new FixFlowClassLoadingException(
					ExceptionCode.CLASSLOAD_EXCEPTION, "fixflowconfig.xml", e);
		}
		// fixflowConfg对象就是是模型
		fixFlowConfig = (FixFlowConfig) resource.getContents().get(0);
		*/
	}
	public static void main(String[] args) throws Exception{
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xml", new XMIResourceFactoryImpl());
		// EMF保存project.xml
		ResourceSet resourceSet = new ResourceSetImpl();
		XMIResource resource = (XMIResource) resourceSet.createResource(org.eclipse.emf.common.util.URI.createFileURI("e:/aa.xml"));
		resource.setEncoding("UTF-8");
		// EMF创建project对象
		Projects sp = ProjectsFactory.eINSTANCE.createProjects();
		
		Project p1 = ProjectsFactory.eINSTANCE.createProject();
		p1.setName("system");
		p1.setResource("resource1");
		sp.getProject().add(p1);
		
		
		Project p = ProjectsFactory.eINSTANCE.createProject();
		p.setName("system2");
		p.setResource("resource2");
		sp.getProject().add(p);
		
		resource.getContents().add(sp);
		resource.save(null);	
	}
	
}
