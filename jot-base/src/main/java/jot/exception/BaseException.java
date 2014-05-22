package jot.exception;

public class BaseException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3258194028700790769L;

	public BaseException() {
	}

	public BaseException(String arg0) {
		super(arg0);
	}

	public BaseException(Throwable arg0) {
		super(arg0);
	}

	public BaseException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public BaseException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

}
