package br.edu.unoescsmo.bootweb.regras;

import java.util.List;

import br.edu.unoescsmo.bootweb.model.Produto;

public interface ProdutoRegra {

	void salvar(Produto produto);

	void delete(Produto produto);

	// List<Cidade> listar();

	// List<Cidade> listarPorNome(String nome);

	Produto buscarPorCodigo(Long codigo);

	List<Produto> dadosGrid();

}
