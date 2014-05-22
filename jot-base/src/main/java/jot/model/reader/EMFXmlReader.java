package jot.model.reader;

import java.net.URL;

import jot.exception.BaseException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class EMFXmlReader {

	public static <T> T reader(URL path, Class<T> clazz, EPackage pkg) {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xml", new XMIResourceFactoryImpl());
		String filePath = path.toString();
		Resource resource = null;
		try {
			resource = resourceSet.createResource(URI.createURI(filePath));
			resourceSet.getPackageRegistry().put(pkg.getNsURI(), pkg);
			resource.load(null);
		} catch (Exception e) {
			throw new BaseException(path + "文件加载失败", e);
		}
		resource.getContents().get(0);
		@SuppressWarnings("unchecked")
		T obj = (T) resource.getContents().get(0);

		return obj;
	}

//	public static void main(String[] args) {
//		Projects prjs = EMFXmlReader.reader("", Projects.class, ProjectsPackage.eINSTANCE);
//		
//	}

}
