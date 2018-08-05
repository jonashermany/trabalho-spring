package br.edu.unoescsmo.trabalhospring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
public class Piloto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codigo;

	@NotEmpty(message = "O campo NOME deve ser preenchido")
	@Column(length = 150, nullable = false)
	private String nome;

	@Column(nullable = false)
	private Integer idade;

	public Piloto() {

	}

	public Piloto(Long codigo) {
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

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

}
