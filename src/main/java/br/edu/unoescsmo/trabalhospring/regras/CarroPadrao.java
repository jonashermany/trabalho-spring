package br.edu.unoescsmo.trabalhospring.regras;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.unoescsmo.trabalhospring.model.Carro;
import br.edu.unoescsmo.trabalhospring.repository.CarroRepository;

@Service
public class CarroPadrao implements CarroRegra {

	@Autowired
	private CarroRepository carroRepository;

	@Override
	public void salvar(Carro carro) {
		carroRepository.save(carro);
	}

	@Override
	public void delete(Carro carro) {
		carroRepository.delete(carro);
	}

	@Override
	public List<Carro> listar() {
		return carroRepository.findAll();
	}

	@Override
	public Carro burcarPorCodigo(Long codigo) {
		return carroRepository.findById(codigo).orElse(new Carro());
	}

	@Override
	public List<Carro> dadosGrid() {
		return carroRepository.dadosGrid();
	}

}
