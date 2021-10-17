package com.flightapp.flightappadmin.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)    
public class AdminNotMatchException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public AdminNotMatchException (String message) {
		super(message);
	}
	
	public AdminNotMatchException(String message, Throwable cause) {
		super (message, cause);
	}
}