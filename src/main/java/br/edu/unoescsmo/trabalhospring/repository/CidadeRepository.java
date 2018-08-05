package br.edu.unoescsmo.trabalhospring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.unoescsmo.trabalhospring.model.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {

}
