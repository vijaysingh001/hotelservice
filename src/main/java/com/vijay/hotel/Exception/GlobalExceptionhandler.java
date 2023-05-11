package com.vijay.hotel.Exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import ch.qos.logback.core.status.Status;

@RestControllerAdvice
public class GlobalExceptionhandler {

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<Map<String,Object>> notFoundHandler(ResourceNotFoundException ex){
		
		Map<String,Object> map=new HashMap<>();
		map.put("message",ex.getMessage());
		map.put("Success", false);
		map.put("Status", HttpStatus.NOT_FOUND);
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(map);
		
	}
	
}
