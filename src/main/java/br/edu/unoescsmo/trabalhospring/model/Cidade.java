package br.edu.unoescsmo.trabalhospring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
public class Cidade {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codigo;

	@NotEmpty(message = "O campo NOME deve ser preenchido")
	@Column(length = 150, nullable = false)
	private String nome;

	@Size(min = 2, max = 2, message = "O campo UF deve ser preenchido com 2 caracteres")
	@Column(length = 2, nullable = false)
	private String uf;

	public Cidade() {

	}

	public Cidade(Long codigo) {
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

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

}
