package jot.web.support;

import jot.web.context.ActionContext;

public interface ViewResolver {

	void render(Object result, ActionContext context);
	
}
