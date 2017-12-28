package com.bntm.app.business.exception;

public class BntmApplicationException extends RuntimeException {
	
	public static final long serialVersionUID = 1L;
	
	public BntmApplicationException() {
		super();
	}
	
	public BntmApplicationException(String msg) {
		super(msg);
	}
	
	public BntmApplicationException(Throwable cause) {
		super(cause);
	}
	
	public BntmApplicationException(String msg, Throwable cause) {
		super(msg, cause);
	}
}
