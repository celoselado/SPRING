package org.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/hello")
public class HelloController {

	@GetMapping
	public String hello() {
		return "Alo mundão";
	}
	
	@GetMapping("/bsm")
	public String bsm() {
		return "Mentalidade de crescimento, Persistência, Responsabilidade pessoal, Orientação ao futuro, "
				+ "Comunicação, Orientação ao detalhe, Proatividade, Trabalho em equipe ";
	}
	
	@GetMapping("/objetivos")
	public String objetivos() {
		return "Absorver o máximo de conteúdo que eu conseguir e realizar os exercicios restantes da lista de MySql!";
	}
}
