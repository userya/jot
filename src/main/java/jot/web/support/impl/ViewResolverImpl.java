package jot.web.support.impl;

import jot.web.context.ActionContext;
import jot.web.support.ExceptionHandler;
import jot.web.support.HttpStatusCode;
import jot.web.support.ViewResolver;

public class ViewResolverImpl implements ViewResolver {

	@Override
	public void render(Object result, ActionContext context) {
		if (result instanceof HttpStatusCode) {

		} else if (result instanceof ExceptionHandler) {
			
		}
		
		
	}

}
