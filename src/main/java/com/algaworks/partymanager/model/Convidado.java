package com.algaworks.partymanager.model;

import javax.persistence.*;

import org.hibernate.validator.constraints.NotBlank;


@Entity
@Table(name="Convidado")
public class Convidado {

	private int idConvidado;
	
	@NotBlank(message = "Nome é obrigatório!")
	private String nome;
	
	@NotBlank(message = "Email é obrigatório!")
	private String email;
	
	private int numAcompanhantes;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getNumAcompanhantes() {
		return numAcompanhantes;
	}

	public void setNumAcompanhantes(int numAcompanhantes) {
		this.numAcompanhantes = numAcompanhantes;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getIdConvidado() {
		return idConvidado;
	}
	public void setIdConvidado(int idConvidado) {
		this.idConvidado = idConvidado;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idConvidado;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Convidado other = (Convidado) obj;
		if (idConvidado != other.idConvidado)
			return false;
		return true;
	}
}
