package com.atividade1.praticandoSpringAtiv1.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping	("/helloworld")
public class HelloWorld {
	
	@GetMapping	
	public String helloworld() {		
		return "Hello World!!";
	}
	
}
