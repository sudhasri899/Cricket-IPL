package com.example.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;



@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(EmailIdNotFoundException.class)
	public ResponseEntity<CustomErrorResponse> globalExceptionHandler1(Exception e, WebRequest request){
		CustomErrorResponse errors = new CustomErrorResponse();	
		 errors.setTimestamp(LocalDateTime.now());
	     errors.setError(e.getMessage());
	     errors.setStatus(HttpStatus.BAD_REQUEST.value());
	     return new ResponseEntity<CustomErrorResponse>(errors,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(EmailIdAlreadyExistException.class)
	public ResponseEntity<CustomErrorResponse> globalExceptionHandler2(Exception e, WebRequest request){
		CustomErrorResponse errors = new CustomErrorResponse();	
		 errors.setTimestamp(LocalDateTime.now());
	     errors.setError(e.getMessage());
	     errors.setStatus(HttpStatus.BAD_REQUEST.value());
	     return new ResponseEntity<CustomErrorResponse>(errors,HttpStatus.BAD_REQUEST);
	}
}
