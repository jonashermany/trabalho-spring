package br.edu.unoescsmo.trabalhospring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;

@Entity
public class Montadora {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codigo;

	@NotEmpty(message = "O campo NOME deve ser preenchido")
	@Column(length = 150, nullable = false)
	private String nome;

	@ManyToOne(fetch = FetchType.LAZY)
	private Cidade cidade;

	public Montadora() {

	}

	public Montadora(Long codigo) {
		this.codigo = codigo;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

}
