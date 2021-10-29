package br.org.generation.objetivo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivo")
public class ObjetivoController {
	
	@GetMapping
	public String objetivoShow() {
		return "Esta semana eu pretendo estudar melhor o MySql e aprender a utilizar o Springboot."
				;

}
}