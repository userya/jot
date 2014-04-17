package jot.web.support;

public interface ExceptionHandler {

	String getName();
	
	String getResult();
	
	Exception getException();
	
	void setException(Exception e);
	
}
