package br.edu.unoescsmo.bootweb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.edu.unoescsmo.bootweb.model.Marca;

public interface MarcaRepository extends JpaRepository<Marca, Long> {

	@Query("select m from Marca m")
	List<Marca> dadosGrid();
}
