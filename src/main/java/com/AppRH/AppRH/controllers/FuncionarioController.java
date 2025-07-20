package com.AppRH.AppRH.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.AppRH.AppRH.models.Dependentes;
import com.AppRH.AppRH.models.Funcionario;
import com.AppRH.AppRH.repository.DependentesRepository;
import com.AppRH.AppRH.repository.FuncionarioRepository;

import jakarta.validation.Valid;

@Controller
public class FuncionarioController {
	
	@Autowired
	private FuncionarioRepository fr;
	
	@Autowired
	private DependentesRepository dr;
	
	//chama o forn de cadastrar funcionarios
	@RequestMapping(value="/cadastrarFuncionario", method = RequestMethod.GET)
	public String form() {
		return "funcionario/formFuncionario"; 
	}
	
	//cadastra funcionario
	@RequestMapping(value = "/cadastrarFuncionario", method = RequestMethod.POST)
	public String form(@Valid Funcionario funcionario, BindingResult result, RedirectAttributes attributes) {
		
		if(result.hasErrors()) {
			attributes.addFlashAttribute("mensagem", "Verifique os campos");
			return "redirect:/cadastrarFuncionario"; 	
		}
		fr.save(funcionario);
		attributes.addFlashAttribute("mensagem", "Funcionario cadastrado com sucesso!");
		return "redirect:/cadastrarFuncionario"; 	
		
	}

}
