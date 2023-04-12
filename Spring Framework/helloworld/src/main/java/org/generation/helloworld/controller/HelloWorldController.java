package org.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// indica para o spring que o código abaixo vai ser um Controller, ou um controlador da nossa API
@RestController 

// indica o endpoint da nossa classe controladora
@RequestMapping("/hello")
public class HelloWorldController {

	@GetMapping // é uma anotação - resposta do http
	public String hello() {
		return "Alo Mundão!! Espero que der certo.";
	}
	
	@GetMapping("/listaBSM")
	public String listaBSM() {
		return "Introdução às Habilidades Comportamentais e Mentalidades\r\n"
				+ "Mentalidade de Crescimento\r\n"
				+ "Persistência\r\n"
				+ "Responsabilidade Pessoal\r\n"
				+ "Orientação ao Futuro\r\n"
				+ "Comunicação\r\n"
				+ "Orientação ao Detalhe\r\n"
				+ "Proatividade\r\n"
				+ "Trabalho em Equipe";
	}
	
	@GetMapping("/listaBSM/listaObjetivo")
	public String listaObjetivo() {
		return "Comunicação\r\n"
				+ "Orientação ao Detalhe\r\n"
				+ "Proatividade\r\n"
				+ "Trabalho em Equipe";
	}
	
}
