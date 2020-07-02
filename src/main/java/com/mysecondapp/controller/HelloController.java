package com.mysecondapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/companies")
	public String Bikes() {
		return "YAMAHA,HONDA,DUCATI";
		
	}
	@RequestMapping("/colours")
	public String color() {
		return "RED,White";
		
	}

}
