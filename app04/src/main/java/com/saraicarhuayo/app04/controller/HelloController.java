package com.saraicarhuayo.app04.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping
	public String saludar() {
		
		return"Hola Sarai";
		
	}
	

}
