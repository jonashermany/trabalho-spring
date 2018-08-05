package br.edu.unoescsmo.trabalhospring.regras;

import java.util.List;

import br.edu.unoescsmo.trabalhospring.model.Montadora;

public interface MontadoraRegra {
	
	void salvar(Montadora montadora);

	void delete(Montadora montadora);

	List<Montadora> listar();
	
	Montadora burcarPorCodigo(Long codigo);
	
	List<Montadora> dadosGrid();

}
