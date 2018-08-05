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

import br.edu.unoescsmo.trabalhospring.model.Carro;
import br.edu.unoescsmo.trabalhospring.regras.CarroRegra;
import br.edu.unoescsmo.trabalhospring.repository.MontadoraRepository;
import br.edu.unoescsmo.trabalhospring.repository.PilotoRepository;

@Controller
@RequestMapping("/carro")
public class CarroController {
	
	@Autowired
	private CarroRegra carroRegra;
	@Autowired
	private MontadoraRepository montadoraRepository;
	@Autowired
	private PilotoRepository pilotoRepository;
	
	@PostMapping("/salvar")
	public String salvar(@Valid Carro carro, BindingResult erros) {
		if (erros.hasErrors()) {
			return "carro/novo";
		}
		carroRegra.salvar(carro);
		return "redirect:/carro/listar";
	}
	
	@PostMapping("/alterar")
	public String alterar(@Valid Carro carro, BindingResult erros) {
		if (erros.hasErrors()) {
			return "carro/visualizar";
		}
		carroRegra.salvar(carro);
		return "redirect:/carro/listar";
	}
	
	@GetMapping("/listar")
	public String listar(Model model) {
		model.addAttribute("carros", carroRegra.dadosGrid());
		return "carro/lista";
	}
	
	@GetMapping("/novo")
	public String novo(Model model) {
		model.addAttribute("montadoras", montadoraRepository.findAll());
		model.addAttribute("pilotos", pilotoRepository.findAll());
		return "carro/novo";
	}

	@GetMapping("/deletar/{codigo}")
	public String deletar(@PathVariable("codigo") Long codigo) {
		carroRegra.delete(new Carro(codigo));
		return "redirect:/carro/listar";
	}

	@GetMapping("/visualizar/{codigo}")
	public String visualizar(@PathVariable("codigo") Long codigo, Model model) {
		model.addAttribute("carro", carroRegra.burcarPorCodigo(codigo));
		model.addAttribute("montadoras", montadoraRepository.findAll());
		model.addAttribute("pilotos", pilotoRepository.findAll());
		return "carro/visualizar";
	}

}
