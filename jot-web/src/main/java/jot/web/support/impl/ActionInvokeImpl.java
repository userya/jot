package jot.web.support.impl;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import jot.exception.BaseException;
import jot.utils.ReflectionUtils;
import jot.web.support.Action;
import jot.web.support.ActionContext;
import jot.web.support.ActionInvoke;

public class ActionInvokeImpl implements ActionInvoke {

	private Action action;

	private Method method;

	private String methodName;

	public ActionInvokeImpl(Action action, String method) {
		this.action = action;
		this.methodName = method;
		initMethod();
	}

	private void initMethod() {
		Method[] methods = ReflectionUtils.getUniqueDeclaredMethods(action.getClass());
		if (methods != null) {
			for (Method m : methods) {
				if (m.getName().equals(methodName)) {
					// TODO check right
					this.method = m;
				}
			}
		}
	}

	@Override
	public Object invokeAction(ActionContext context) {
		List<Object> parameters = new ArrayList<Object>();
		Class<?>[] types = method.getParameterTypes();
		for (Class<?> class1 : types) {
			if (class1.equals(ActionContext.class)) {
				parameters.add(context);
			}
		}
		try {
			return method.invoke(this, parameters.toArray(new Object[0]));
		} catch (IllegalAccessException e) {
			e.printStackTrace();
			throw new BaseException(e);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
			throw new BaseException(e);
		} catch (InvocationTargetException e) {
			e.printStackTrace();
			throw new BaseException(e);
		}
	}

	@Override
	public Action getAction() {
		return action;
	}

}
