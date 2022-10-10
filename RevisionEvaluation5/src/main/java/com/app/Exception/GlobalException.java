package com.app.Exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalException {
	
	@ExceptionHandler(UserException.class)
	public ResponseEntity<ExceptionDetails> userExceptionHandler(UserException u,WebRequest wr)
	{
		ExceptionDetails ed = new ExceptionDetails(LocalDateTime.now(), u.getMessage(), wr.getDescription(false));
		return new ResponseEntity<ExceptionDetails>(ed, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ExceptionDetails> allExceptionHandler(Exception u, WebRequest wr)
	{
		ExceptionDetails eDetails = new ExceptionDetails(LocalDateTime.now(), u.getMessage(), wr.getDescription(false));
		return new ResponseEntity<ExceptionDetails>(eDetails, HttpStatus.BAD_REQUEST);
	}
	
}
