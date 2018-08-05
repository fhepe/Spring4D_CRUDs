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
import br.edu.unoescsmo.bootweb.model.Produto;
import br.edu.unoescsmo.bootweb.regras.ProdutoRegra;
import br.edu.unoescsmo.bootweb.repository.MarcaRepository;
import br.edu.unoescsmo.bootweb.repository.TipoProdutoRepository;

@Controller
@RequestMapping("/produto")
public class ProdutoController {

	@Autowired
	private ProdutoRegra produtoRegra;
	@Autowired
	private TipoProdutoRepository tipoProdutoRepository;
	@Autowired
	private MarcaRepository marcaRepository;

	@PostMapping("/salvar")
	public String salvar(@Valid Produto produto, BindingResult erros) {
		if (erros.hasErrors()) {
			return "produto/novo";
		}
		produtoRegra.salvar(produto);
		return "redirect:/produto/listar";
	}

	@PostMapping("/alterar")
	public String alterar(@Valid Produto produto, BindingResult erros) {
		if (erros.hasErrors()) {
			return "produto/visualizar";
		}
		produtoRegra.salvar(produto);
		return "redirect:/produto/listar";
	}

	@GetMapping("/listar")
	public String listar(Model model) {
		// Torna a lista de produtos acessível no JSP
		model.addAttribute("produtos", produtoRegra.dadosGrid());
		// Caminho + Nome do JSP que será renderizado para a tela
		return "produto/lista";
	}

	@GetMapping("/novo")
	public String novo(Model model) {
		model.addAttribute("tiposProduto", tipoProdutoRepository.findAll());
		model.addAttribute("marcas", marcaRepository.findAll());
		return "produto/novo";
	}

	@GetMapping("/deletar/{codigo}")
	public String deletar(@PathVariable("codigo") Long codigo) {
		produtoRegra.delete(new Produto(codigo));
		return "redirect:/produto/listar";
	}

	@GetMapping("/visualizar/{codigo}")
	public String visualizar(@PathVariable("codigo") Long codigo, Model model) {
		model.addAttribute("produto", produtoRegra.buscarPorCodigo(codigo));
		model.addAttribute("tiposProduto", tipoProdutoRepository.findAll());
		model.addAttribute("marcas", marcaRepository.findAll());
		return "produto/visualizar";
	}
}
