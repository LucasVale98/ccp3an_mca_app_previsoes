package br.usjt.PrevisaoTempo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import br.usjt.PrevisaoTempo.model.Tempo;
import br.usjt.PrevisaoTempo.repository.TempoRepository;

@Controller
public class TempoController {

	@Autowired
	private TempoRepository tempoRespo;
	
	@GetMapping("/temperatura")
	public ModelAndView listarTemperatura() {
		
		ModelAndView mv = new ModelAndView("lista_temperatura");
		
		mv.addObject(new Tempo());
		
		List <Tempo> temps = tempoRespo.findAll();
		
		mv.addObject("temperatura", temps);
		
		return mv;
	}
	
	@PostMapping
	public String salvar (Tempo tempo) {
		tempoRespo.save(tempo);
		return "redirect:/temperatura";
	}
	
}
