package br.edu.unoescsmo.bootweb.regras;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.unoescsmo.bootweb.model.Produto;
import br.edu.unoescsmo.bootweb.repository.ProdutoRepository;

@Service
public class ProdutoPadrao implements ProdutoRegra {

	@Autowired
	private ProdutoRepository produtoRepository;

	@Override
	public void salvar(Produto produto) {
		produtoRepository.save(produto);
	}

	@Override
	public void delete(Produto produto) {
		produtoRepository.delete(produto);
	}

	@Override
	public Produto buscarPorCodigo(Long codigo) {
		return produtoRepository.findById(codigo).orElse(new Produto());
	}

	@Override
	public List<Produto> dadosGrid() {
		return produtoRepository.dadosGrid();
	}

}
