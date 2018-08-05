package br.edu.unoescsmo.trabalhospring.regras;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.unoescsmo.trabalhospring.model.Piloto;
import br.edu.unoescsmo.trabalhospring.repository.PilotoRepository;

@Service
public class PilotoPadrao implements PilotoRegra {

	@Autowired
	private PilotoRepository pilotoRepository;

	@Override
	public void salvar(Piloto piloto) {
		pilotoRepository.save(piloto);
	}

	@Override
	public void delete(Piloto piloto) {
		pilotoRepository.delete(piloto);
	}

	@Override
	public List<Piloto> listar() {
		return pilotoRepository.findAll();
	}

	@Override
	public Piloto burcarPorCodigo(Long codigo) {
		return pilotoRepository.findById(codigo).orElse(new Piloto());
	}

}
