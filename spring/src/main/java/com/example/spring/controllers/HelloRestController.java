package com.example.spring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.entities.Greeting;

@RestController
public class HelloRestController {
	
	@GetMapping("/rest")
	public Greeting greet(@RequestParam(defaultValue = "world",required = false) String name) {
		Greeting greeting = new Greeting(String.format("Hello, %s !", name));
		return greeting;
		
	}

}
