package br.edu.unoescsmo.bootweb.regras;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.unoescsmo.bootweb.model.Marca;
import br.edu.unoescsmo.bootweb.repository.MarcaRepository;

@Service
public class MarcaPadrao implements MarcaRegra {

	@Autowired
	private MarcaRepository marcaRepository;

	@Override
	public void salvar(Marca marca) {
		marcaRepository.save(marca);
	}

	@Override
	public void delete(Marca marca) {
		marcaRepository.delete(marca);
	}

	@Override
	public Marca buscarPorCodigo(Long codigo) {
		return marcaRepository.findById(codigo).orElse(new Marca());
	}

	@Override
	public List<Marca> dadosGrid() {
		return marcaRepository.dadosGrid();
	}

}
