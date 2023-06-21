package com.udemy.in28minutes.microservices.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.udemy.in28minutes.microservices.limitsservice.bean.Limits;
import com.udemy.in28minutes.microservices.limitsservice.configuration.Configuration;

@RestController
public class LimitsController {
	
	@Autowired
	Configuration configuration;
	
	
	@GetMapping("/limits")
	public Limits retrieveLimits() {
		return new Limits(configuration.getMinimum(),configuration.getMaximum());
	}
}
