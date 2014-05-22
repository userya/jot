package jot.web.support;


public interface ActionInvoke {

	Object invokeAction(ActionContext context);

	Action getAction();
	
}
