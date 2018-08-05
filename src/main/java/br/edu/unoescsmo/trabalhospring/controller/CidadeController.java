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

import br.edu.unoescsmo.trabalhospring.model.Cidade;
import br.edu.unoescsmo.trabalhospring.regras.CidadeRegra;

@Controller
@RequestMapping("/cidade")
public class CidadeController {

	@Autowired
	private CidadeRegra cidadeRegra;
	
	@PostMapping("/salvar")
	public String salvar(@Valid Cidade cidade, BindingResult erros) {
		if (erros.hasErrors()) {
			return "cidade/novo";
		}
		cidadeRegra.salvar(cidade);
		return "redirect:/cidade/listar";
	}
	
	@PostMapping("/alterar")
	public String alterar(@Valid Cidade cidade, BindingResult erros) {
		if (erros.hasErrors()) {
			return "cidade/visualizar";
		}
		cidadeRegra.salvar(cidade);
		return "redirect:/cidade/listar";
	}
	
	@GetMapping("/listar")
	public String listar(Model model) {
		model.addAttribute("cidades", cidadeRegra.listar());
		return "cidade/lista";
	}
	
	@GetMapping("/novo")
	public String novo(Model model) {
		return "cidade/novo";
	}

	@GetMapping("/deletar/{codigo}")
	public String deletar(@PathVariable("codigo") Long codigo) {
		cidadeRegra.delete(new Cidade(codigo));
		return "redirect:/cidade/listar";
	}

	@GetMapping("/visualizar/{codigo}")
	public String visualizar(@PathVariable("codigo") Long codigo, Model model) {
		model.addAttribute("cidade", cidadeRegra.burcarPorCodigo(codigo));
		return "cidade/visualizar";
	}
}
