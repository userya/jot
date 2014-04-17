package test;

import java.io.InputStream;
import java.net.URL;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import junit.framework.TestCase;

public class LoadEmf extends TestCase {

	public void testLoad(){
		/*
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xml", new XMIResourceFactoryImpl());
		InputStream inputStream = null;
		String classPath = "config/fixflowconfig.xml";
		URL url = this.getClass().getClassLoader().getResource(classPath);
		if(url == null){
			log.error("未能从{}目录下找到fixflowconfig.xml文件",classPath);
			throw new FixFlowClassLoadingException(ExceptionCode.CLASSLOAD_EXCEPTION_FILENOTFOUND ,"fixflowconfig.xml");
		}
		String filePath = url.toString();
		Resource resource = null;
		try {
			//判断xml是否在jar中
			if (!filePath.startsWith("jar")) {
				filePath = java.net.URLDecoder.decode(ReflectUtil.getResource(classPath).getFile(), "utf-8");
				resource = resourceSet.createResource(URI.createFileURI(filePath));
			} else {
				resource = resourceSet.createResource(URI.createURI(filePath));
			}
			//CoreconfigPackage 是自己模型的package
			resourceSet.getPackageRegistry().put(CoreconfigPackage.eINSTANCE.getNsURI(), CoreconfigPackage.eINSTANCE);
			resource.load(null);
		} catch (Exception e) {
			log.error("fixflowconfig.xml文件加载失败", e);
			throw new FixFlowClassLoadingException(ExceptionCode.CLASSLOAD_EXCEPTION,"fixflowconfig.xml", e);
		}
		//fixflowConfg对象就是是模型
		fixFlowConfig = (FixFlowConfig) resource.getContents().get(0);
		*/
	}
	
	
}
