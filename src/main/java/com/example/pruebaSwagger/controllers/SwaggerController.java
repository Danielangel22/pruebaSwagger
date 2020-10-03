package com.example.pruebaSwagger.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mensaje")
public class SwaggerController {

	@GetMapping
	public String saludo() {
		return "Hola mundo";
	}
	
}
