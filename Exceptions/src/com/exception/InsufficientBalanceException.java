package com.exception;

public class InsufficientBalanceException extends Exception{

	private String message;

	public String getMessage() {
		return message;
	}

	public InsufficientBalanceException(String message) {
		super();
		this.message = message;
	}
	
}
