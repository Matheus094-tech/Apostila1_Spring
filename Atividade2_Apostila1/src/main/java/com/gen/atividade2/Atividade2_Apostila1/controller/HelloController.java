package com.gen.atividade2.Atividade2_Apostila1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class HelloController {

	@RestController 
	@RequestMapping("/habilidade")
	public class HelloCrontroller {

			@GetMapping
			public String habilidade() {
				
				return "Irei trabalhar a habilidade de persistencia";
			
			}
	}
}
