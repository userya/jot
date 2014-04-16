package jot.web.conf;

import java.util.Map;

import jot.monitor.Monitor;

public interface JPackage extends Monitor {

	String getName();

	String getExtends();

	String getNamespace();

	boolean isAbstract();

	Map<String, JAction> getActions();

	Map<String, JService> getServices();

	Map<String, String> getInterceptorMap();

	Map<String, String> getExceptionHandlerMap();

	
}
