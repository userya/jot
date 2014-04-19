package jot.web.engine.conf;

import java.net.URL;

import jot.model.package_.Package;
import jot.model.package_.PackagePackage;
import jot.model.reader.EMFXmlReader;

public class PackageLoader {

	public Package load(URL path) {
		return EMFXmlReader.reader(path, Package.class,
				PackagePackage.eINSTANCE);
	}
}
