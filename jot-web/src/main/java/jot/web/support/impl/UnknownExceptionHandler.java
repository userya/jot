package jot.web.support.impl;

import jot.web.support.ExceptionHandler;

public class UnknownExceptionHandler implements ExceptionHandler {

	private Exception exception;
	
	public UnknownExceptionHandler() {
	}

	@Override
	public String getName() {
		return null;
	}

	@Override
	public String getResult() {
		return null;
	}

	@Override
	public Exception getException() {
		return exception;
	}

	@Override
	public void setException(Exception e) {
		
	}

}
