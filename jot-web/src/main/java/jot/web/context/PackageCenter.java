package jot.web.context;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jot.web.support.HttpStatusCode;
import jot.web.support.Package;
import jot.web.support.ViewResolver;

public class PackageCenter {

	private Map<String, Package> packageMap = new HashMap<String, Package>();

	private ViewResolver viewResolver;

	public void put(String name, Package pkg) {
		packageMap.put(name, pkg);
	}

	public Package get(String name) {
		return packageMap.get(name);
	}

	public boolean contain(String name) {
		return packageMap.containsKey(name);
	}

	/**
	 * String aaa = "/a/b/c/dd";
	 * System.out.println(aaa.substring(0,aaa.lastIndexOf("/")));
	 * System.out.println(aaa.substring(aaa.lastIndexOf("/")+1));
	 * 
	 * @param request
	 * @param response
	 */
	public void invoke(HttpServletRequest request, HttpServletResponse response) {
		ActionContext context = new ActionContext();
		context.setRequest(request);
		context.setResponse(response);
		String uri = request.getRequestURI();
		int index = uri.lastIndexOf("/");
		if (index > -1) {
			String packageNamespace = uri.substring(0, index);
			if (packageMap.containsKey(packageNamespace)) {
				Package pkg = packageMap.get(packageNamespace);
				String actionUri = uri.substring(index + 1);
				Object result = pkg.invokeAction(actionUri, context);
				viewResolver.render(result, context);
			} else {
				// 404
				viewResolver.render(HttpStatusCode.Code404, context);
			}
		}
		// 首页
	}

}
