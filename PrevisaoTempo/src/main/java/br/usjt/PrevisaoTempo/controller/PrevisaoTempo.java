package br.usjt.PrevisaoTempo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PrevisaoTempo{

	@GetMapping("/tempo")
	public String previsaoTempo() {
		return "previsao_tempo";
	}
}
