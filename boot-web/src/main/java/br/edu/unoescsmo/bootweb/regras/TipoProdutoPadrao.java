package br.edu.unoescsmo.bootweb.regras;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.unoescsmo.bootweb.model.TipoProduto;
import br.edu.unoescsmo.bootweb.repository.TipoProdutoRepository;

@Service
public class TipoProdutoPadrao implements TipoProdutoRegra {

	@Autowired
	private TipoProdutoRepository tipoProdutoRepository;

	@Override
	public void salvar(TipoProduto tipoProduto) {
		tipoProdutoRepository.save(tipoProduto);
	}

	@Override
	public void delete(TipoProduto tipoProduto) {
		tipoProdutoRepository.delete(tipoProduto);
	}

	@Override
	public TipoProduto buscarPorCodigo(Long codigo) {
		return tipoProdutoRepository.findById(codigo).orElse(new TipoProduto());
	}

	@Override
	public List<TipoProduto> dadosGrid() {
		return tipoProdutoRepository.dadosGrid();
	}

}
