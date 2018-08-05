package br.edu.unoescsmo.trabalhospring.regras;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.unoescsmo.trabalhospring.model.Cidade;
import br.edu.unoescsmo.trabalhospring.repository.CidadeRepository;

@Service
public class CidadePadrao implements CidadeRegra {

	@Autowired
	private CidadeRepository cidadeRepository;
	
	@Override
	public void salvar(Cidade cidade) {
		cidadeRepository.save(cidade);
	}

	@Override
	public void delete(Cidade cidade) {
		cidadeRepository.delete(cidade);
	}

	@Override
	public List<Cidade> listar() {
		return cidadeRepository.findAll();
	}

	@Override
	public Cidade burcarPorCodigo(Long codigo) {
		return cidadeRepository.findById(codigo).orElse(new Cidade());
	}

}
