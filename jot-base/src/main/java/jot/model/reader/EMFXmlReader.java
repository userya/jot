package jot.model.reader;

import java.io.FileNotFoundException;
import java.net.URL;

import jot.exception.BaseException;
import jot.utils.ResourceUtils;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class EMFXmlReader {

	public static <T> T reader(String path, Class<T> clazz, EPackage pkg) {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xml", new XMIResourceFactoryImpl());
		URL url;
		try {
			url = ResourceUtils.getURL(path);
		} catch (FileNotFoundException e1) {
			throw new BaseException("can not found xml by path[" + path + "]", e1);
		}
		String filePath = url.toString();
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
