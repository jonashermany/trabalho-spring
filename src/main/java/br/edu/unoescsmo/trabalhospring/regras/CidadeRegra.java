package br.edu.unoescsmo.trabalhospring.regras;

import java.util.List;

import br.edu.unoescsmo.trabalhospring.model.Cidade;

public interface CidadeRegra {

	void salvar(Cidade cidade);

	void delete(Cidade cidade);

	List<Cidade> listar();
	
	Cidade burcarPorCodigo(Long codigo);
}
