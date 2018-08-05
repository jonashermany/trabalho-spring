package br.edu.unoescsmo.trabalhospring.regras;

import java.util.List;

import br.edu.unoescsmo.trabalhospring.model.Piloto;

public interface PilotoRegra {

	void salvar(Piloto piloto);

	void delete(Piloto piloto);

	List<Piloto> listar();
	
	Piloto burcarPorCodigo(Long codigo);
}
