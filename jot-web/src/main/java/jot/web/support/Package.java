package jot.web.support;

import jot.web.conf.JPackage;
import jot.web.context.ActionContext;

public interface Package{

	JPackage getJPackage();

	boolean contain(String uri);

	Object invokeAction(String uri, ActionContext context);
	
}
