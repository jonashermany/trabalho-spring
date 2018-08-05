package br.edu.unoescsmo.trabalhospring.regras;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.unoescsmo.trabalhospring.model.Montadora;
import br.edu.unoescsmo.trabalhospring.repository.MontadoraRepository;

@Service
public class MontadoraPadrao implements MontadoraRegra {
	
	@Autowired
	private MontadoraRepository montadoraRepository;

	@Override
	public void salvar(Montadora montadora) {
		montadoraRepository.save(montadora);
	}

	@Override
	public void delete(Montadora montadora) {
		montadoraRepository.delete(montadora);
	}

	@Override
	public List<Montadora> listar() {
		return montadoraRepository.findAll();
	}

	@Override
	public Montadora burcarPorCodigo(Long codigo) {
		return montadoraRepository.findById(codigo).orElse(new Montadora());
	}

	@Override
	public List<Montadora> dadosGrid() {
		return montadoraRepository.dadosGrid();
	}

}
