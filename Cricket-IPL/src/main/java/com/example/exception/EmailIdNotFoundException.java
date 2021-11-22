package com.example.exception;

public class EmailIdNotFoundException extends RuntimeException{

	public EmailIdNotFoundException() {
		super("Email Id is not found");
	}
}
