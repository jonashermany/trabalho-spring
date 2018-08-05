package br.edu.unoescsmo.trabalhospring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
public class Carro {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codigo;

	@NotEmpty(message = "O campo NOME deve ser preenchido")
	@Column(length = 150, nullable = false)
	private String nome;

	@Size(min = 4, max = 4, message = "O campo ANO deve ser preenchido com 4 dígitos")
	@Column(length = 4, nullable = false)
	private String ano;

	@ManyToOne(fetch = FetchType.LAZY)
	private Montadora montadora;

	@ManyToOne(fetch = FetchType.LAZY)
	private Piloto piloto;

	public Carro() {

	}

	public Carro(Long codigo) {
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

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public Montadora getMontadora() {
		return montadora;
	}

	public void setMontadora(Montadora montadora) {
		this.montadora = montadora;
	}

	public Piloto getPiloto() {
		return piloto;
	}

	public void setPiloto(Piloto piloto) {
		this.piloto = piloto;
	}

}
