package com.empmgmt.playground.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	
	
	
	@GetMapping("/hello")
	public String getApp() {
		return "hello world";
	}

}
