package br.edu.unoescsmo.trabalhospring.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.unoescsmo.trabalhospring.model.Montadora;
import br.edu.unoescsmo.trabalhospring.regras.MontadoraRegra;
import br.edu.unoescsmo.trabalhospring.repository.CidadeRepository;

@Controller
@RequestMapping("/montadora")
public class MontadoraController {
	
	@Autowired
	private MontadoraRegra montadoraRegra;
	@Autowired
	private CidadeRepository cidadeRepository;
	
	@PostMapping("/salvar")
	public String salvar(@Valid Montadora montadora, BindingResult erros) {
		if (erros.hasErrors()) {
			return "montadora/novo";
		}
		montadoraRegra.salvar(montadora);
		return "redirect:/montadora/listar";
	}
	
	@PostMapping("/alterar")
	public String alterar(@Valid Montadora montadora, BindingResult erros) {
		if (erros.hasErrors()) {
			return "montadora/visualizar";
		}
		montadoraRegra.salvar(montadora);
		return "redirect:/montadora/listar";
	}
	
	@GetMapping("/listar")
	public String listar(Model model) {
		model.addAttribute("montadoras", montadoraRegra.listar());
		return "montadora/lista";
	}
	
	@GetMapping("/novo")
	public String novo(Model model) {
		model.addAttribute("cidades", cidadeRepository.findAll());
		return "montadora/novo";
	}

	@GetMapping("/deletar/{codigo}")
	public String deletar(@PathVariable("codigo") Long codigo) {
		montadoraRegra.delete(new Montadora(codigo));
		return "redirect:/montadora/listar";
	}

	@GetMapping("/visualizar/{codigo}")
	public String visualizar(@PathVariable("codigo") Long codigo, Model model) {
		model.addAttribute("montadora", montadoraRegra.burcarPorCodigo(codigo));
		model.addAttribute("cidades", cidadeRepository.findAll());
		return "montadora/visualizar";
	}

}
