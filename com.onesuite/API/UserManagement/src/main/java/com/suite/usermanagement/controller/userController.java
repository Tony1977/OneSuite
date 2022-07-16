package com.suite.usermanagement.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Validated
@RestController
@RequestMapping("/users")
public class userController {

	@GetMapping(value = "/find")
	public ResponseEntity<String> getAllSales() {
		
		return new ResponseEntity<String>("this is working", HttpStatus.OK);
	}
	
}