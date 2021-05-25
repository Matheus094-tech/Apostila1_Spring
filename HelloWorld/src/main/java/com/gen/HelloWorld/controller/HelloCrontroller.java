package com.gen.HelloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/habilidade")
public class HelloCrontroller {

		@GetMapping
		public String habilidade() {
			
			return "Perseverança, atenção aos detalhes";
		
		}
}
