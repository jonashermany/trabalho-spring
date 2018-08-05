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

import br.edu.unoescsmo.trabalhospring.model.Piloto;
import br.edu.unoescsmo.trabalhospring.regras.PilotoRegra;

@Controller
@RequestMapping("/piloto")
public class PilotoController {

	@Autowired
	private PilotoRegra pilotoRegra;
	
	@PostMapping("/salvar")
	public String salvar(@Valid Piloto piloto, BindingResult erros) {
		if (erros.hasErrors()) {
			return "piloto/novo";
		}
		pilotoRegra.salvar(piloto);
		return "redirect:/piloto/listar";
	}
	
	@PostMapping("/alterar")
	public String alterar(@Valid Piloto piloto, BindingResult erros) {
		if (erros.hasErrors()) {
			return "piloto/visualizar";
		}
		pilotoRegra.salvar(piloto);
		return "redirect:/piloto/listar";
	}
	
	@GetMapping("/listar")
	public String listar(Model model) {
		model.addAttribute("pilotos", pilotoRegra.listar());
		return "piloto/lista";
	}
	
	@GetMapping("/novo")
	public String novo(Model model) {
		return "piloto/novo";
	}

	@GetMapping("/deletar/{codigo}")
	public String deletar(@PathVariable("codigo") Long codigo) {
		pilotoRegra.delete(new Piloto(codigo));
		return "redirect:/piloto/listar";
	}

	@GetMapping("/visualizar/{codigo}")
	public String visualizar(@PathVariable("codigo") Long codigo, Model model) {
		model.addAttribute("piloto", pilotoRegra.burcarPorCodigo(codigo));
		return "piloto/visualizar";
	}
}
