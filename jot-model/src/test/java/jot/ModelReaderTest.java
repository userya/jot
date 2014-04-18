package jot;

import java.util.Map;

import jot.model.projects.ProjectResource;
import jot.model.projects.Projects;
import junit.framework.TestCase;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class ModelReaderTest extends TestCase{

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
	
	public void testCreate() throws Exception{
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xml", new XMIResourceFactoryImpl());
		// EMF保存project.xml
		ResourceSet resourceSet = new ResourceSetImpl();
		XMIResource resource = (XMIResource) resourceSet.createResource(org.eclipse.emf.common.util.URI.createFileURI("d:/aa.xml"));
		resource.setEncoding("UTF-8");
		// EMF创建project对象
		
		Projects ps = jot.model.projects.ProjectFactory.eINSTANCE.createProjects();
		ProjectResource pr = jot.model.projects.ProjectFactory.eINSTANCE.createProjectResource();
		pr.setName("test");
		pr.setResource("testresource");
		ps.getProject().add(pr);
		
		ProjectResource pr2 = jot.model.projects.ProjectFactory.eINSTANCE.createProjectResource();
		pr2.setName("test2");
		pr2.setResource("testresource21111");
		ps.getProject().add(pr2);
		
		resource.getContents().add(ps);
		resource.save(null);
	}
}
