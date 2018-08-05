package br.edu.unoescsmo.bootweb.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.unoescsmo.bootweb.model.TipoProduto;
import br.edu.unoescsmo.bootweb.regras.TipoProdutoRegra;

@Controller
@RequestMapping("/tipoProduto")
public class TipoProdutoController {

	@Autowired
	private TipoProdutoRegra tipoProdutoRegra;

	@PostMapping("/salvar")
	public String salvar(@Valid TipoProduto tipoProduto, BindingResult erros) {
		if (erros.hasErrors()) {
			return "tipoProduto/novo";
		}
		tipoProdutoRegra.salvar(tipoProduto);
		return "redirect:/tipoProduto/listar";
	}

	@PostMapping("/alterar")
	public String alterar(@Valid TipoProduto tipoProduto, BindingResult erros) {
		if (erros.hasErrors()) {
			return "tipoProduto/visualizar";
		}
		tipoProdutoRegra.salvar(tipoProduto);
		return "redirect:/tipoProduto/listar";
	}

	@GetMapping("/listar")
	public String listar(Model model) {
		// Torna a lista de produtos acessível no JSP
		model.addAttribute("tiposProduto", tipoProdutoRegra.dadosGrid());
		// Caminho + Nome do JSP que será renderizado para a tela
		return "tipoProduto/lista";
	}

	@GetMapping("/novo")
	public String novo() {
		return "tipoProduto/novo";
	}

	@GetMapping("/deletar/{codigo}")
	public String deletar(@PathVariable("codigo") Long codigo) {
		tipoProdutoRegra.delete(new TipoProduto(codigo));
		return "redirect:/tipoProduto/listar";
	}

	@GetMapping("/visualizar/{codigo}")
	public String visualizar(@PathVariable("codigo") Long codigo, Model model) {
		model.addAttribute("tipoProduto", tipoProdutoRegra.buscarPorCodigo(codigo));
		return "tipoProduto/visualizar";
	}

}
