package br.edu.unoescsmo.trabalhospring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.edu.unoescsmo.trabalhospring.model.Montadora;

public interface MontadoraRepository extends JpaRepository<Montadora, Long> {

	@Query("select m from Montadora m left join fetch m.cidade")
	List<Montadora> dadosGrid();

}
