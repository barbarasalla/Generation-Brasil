package com.atividade1.praticandoSpringAtiv1.bsm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping	("/bsmgeneration")
public class BSMGeneration {
	
	@GetMapping	
	public String bsm() {		
		return "---------BSMs Generation---------"
				+ "\n\nMentalidades: \n[1] Persistência \n[2] Mentalidade de Crescimento "
				+ "\n[3] Responsabilidade Pessoal \n[4] Orientação Ao Futuro "
				+ "\n\nHabilidades/Competências Comportamentais: \n[1] Comunicação \n[2] Proatividade "
				+ "\n[3] Orientação Ao Detalhe \n[4] Trabalho Em Equipe";
	}

}