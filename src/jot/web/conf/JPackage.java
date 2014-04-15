package jot.web.conf;

import java.util.Map;

import jot.monitor.Monitor;
import jot.web.support.ExceptionHandler;
import jot.web.support.Interceptor;

public interface JPackage extends Monitor {

	String getName();

	String getExtends();

	String getNamespace();

	boolean isAbstract();

	Map<String, JAction> getActions();

	Map<String, JService> getServices();

	Map<String, Interceptor> getInterceptorMap();

	Map<String, ExceptionHandler> getExceptionHandlerMap();

	boolean isMatchNamespace(String uri);


}
