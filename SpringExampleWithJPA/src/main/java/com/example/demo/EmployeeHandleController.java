package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class EmployeeHandleController {
	
	@ExceptionHandler(EmployeeIDNotAvailable.class)
	public ResponseEntity getExcpeiton()
	{
		System.out.println("this is global exception...");
		return new ResponseEntity<>("Employee id not available in database", HttpStatus.NOT_FOUND);
	}

}
