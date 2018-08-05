package br.edu.unoescsmo.trabalhospring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.edu.unoescsmo.trabalhospring.model.Carro;

public interface CarroRepository extends JpaRepository<Carro, Long>{
	
	@Query("select c from Carro c left join fetch c.montadora left join fetch c.piloto")
	List<Carro> dadosGrid();

}
