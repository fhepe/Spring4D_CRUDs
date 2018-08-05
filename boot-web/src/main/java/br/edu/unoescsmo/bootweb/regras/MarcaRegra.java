package br.edu.unoescsmo.bootweb.regras;

import java.util.List;

import br.edu.unoescsmo.bootweb.model.Marca;

public interface MarcaRegra {

	void salvar(Marca marca);

	void delete(Marca marca);

	Marca buscarPorCodigo(Long codigo);

	List<Marca> dadosGrid();
}
