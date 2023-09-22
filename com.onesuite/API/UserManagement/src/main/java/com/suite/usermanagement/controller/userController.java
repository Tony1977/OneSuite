package com.suite.usermanagement.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onesuite.usermanagement.repository.AccountsRepository;
import com.onesuite.usermanagment.model.Accounts;
import com.onesuite.usermanagment.model.UserInfo;

import io.micrometer.core.annotation.Timed;


@Validated
@RestController
@RequestMapping("/users")
public class userController {

	private static final Logger logger = LoggerFactory.getLogger(userController.class);
	
	@Autowired
	private AccountsRepository accountsRepository;
	
	@GetMapping(value = "/find")
	public ResponseEntity<String> getAllSales() {
		
		return new ResponseEntity<String>("this is working", HttpStatus.OK);
	}
	
	@PostMapping("/myAccount")
	@Timed(value = "getAccountDetails.time", description = "Time taken to return Account Details")
	public Accounts getAccountDetails(@RequestBody UserInfo customer) {

		logger.info(customer.toString());
		Accounts accounts = accountsRepository.findByCustomerId(1);
		if (accounts != null) {
			return accounts;
		} else {
			return null;
		}

	}
	
}