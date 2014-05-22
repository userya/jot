package jot.model.writer;

import java.io.IOException;
import java.util.Map;

import jot.exception.BaseException;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class EMFXmlWriter {

	/**
	 * 
	 * @param emfObject
	 * @param path
	 *            e:/aa.xml
	 */
	public static void writer(EObject emfObject, String path) {
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xml", new XMIResourceFactoryImpl());
		// EMF保存project.xml
		ResourceSet resourceSet = new ResourceSetImpl();
		XMIResource resource = (XMIResource) resourceSet
				.createResource(org.eclipse.emf.common.util.URI
						.createFileURI(path));
		resource.setEncoding("UTF-8");
		resource.getContents().add(emfObject);
		try {
			resource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
			throw new BaseException(e);
		}
	}
}
