package jot.web.exception;

import jot.web.support.ExceptionHandler;

public class DefaultExceptionHandler implements ExceptionHandler {

	private Exception exception;
	
	@Override
	public String getName() {
		return "default exception handler";
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
		this.exception = e;
	}

}
