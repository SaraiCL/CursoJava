package com.saraicarhuayo.app02.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping
	public String saludar() {
		return "Hola. Java es facilito";
	}	

}
