package br.edu.unoescsmo.bootweb.regras;

import java.util.List;

import br.edu.unoescsmo.bootweb.model.TipoProduto;

public interface TipoProdutoRegra {

	void salvar(TipoProduto tipoProduto);

	void delete(TipoProduto tipoProduto);

	TipoProduto buscarPorCodigo(Long codigo);

	List<TipoProduto> dadosGrid();
}
