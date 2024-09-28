package com.AppRH.AppRH.controllers;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.AppRH.AppRH.models.Candidato;
import com.AppRH.AppRH.models.Vaga;
import com.AppRH.AppRH.repository.CandidatoRepository;
import com.AppRH.AppRH.repository.VagaRepository;

@Controller
public class VagaController {
	
	private VagaRepository vr;
	private CandidatoRepository cr;
	
	// Cadastra vaga
	@RequestMapping (value = "/cadastrarVaga", method = RequestMethod.GET )
	public String form() {
		return "vaga/fromVaga";
	}
	
	@RequestMapping (value = "/cadastrarVaga", method = RequestMethod.POST)
	public String form(@Valid Vaga vaga, BindingResult result, RedirectAttributes attributes) {
		if (result.hasErrors()) {
			attributes.addFlashAttribute("mensagem", "Verifique os campos...");
			return "redirect:/cadastrarVaga";
		}
		
		vr.save(vaga);
		attributes.addFlashAttribute("mensagem", "Vaga cadastrada com sucesso!");
		return "redirect:/cadastrarVaga";
	}
}
