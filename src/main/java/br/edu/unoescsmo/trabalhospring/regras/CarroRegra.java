package br.edu.unoescsmo.trabalhospring.regras;

import java.util.List;

import br.edu.unoescsmo.trabalhospring.model.Carro;

public interface CarroRegra {

	void salvar(Carro carro);

	void delete(Carro carro);

	List<Carro> listar();
	
	Carro burcarPorCodigo(Long codigo);
	
	List<Carro> dadosGrid();
}
