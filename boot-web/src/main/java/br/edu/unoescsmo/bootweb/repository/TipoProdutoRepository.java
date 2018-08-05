package br.edu.unoescsmo.bootweb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.edu.unoescsmo.bootweb.model.TipoProduto;

public interface TipoProdutoRepository extends JpaRepository<TipoProduto, Long> {

	@Query("select t from TipoProduto t")
	List<TipoProduto> dadosGrid();
}
