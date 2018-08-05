package br.edu.unoescsmo.bootweb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.edu.unoescsmo.bootweb.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

	@Query("select p from Produto p left join fetch p.tipoProduto left join fetch p.marca")
	List<Produto> dadosGrid();
}
