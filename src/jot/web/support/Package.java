package jot.web.support;

import jot.web.conf.JPackage;

public interface Package{

	JPackage getJPackage();

	boolean contain(String uri);

	Object invokeAction(String uri);
	
}
