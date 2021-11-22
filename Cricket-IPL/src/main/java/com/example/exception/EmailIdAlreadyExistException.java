package com.example.exception;

public class EmailIdAlreadyExistException extends RuntimeException{

	public EmailIdAlreadyExistException() {
		super("Email Id Already Exist");
	}
}
