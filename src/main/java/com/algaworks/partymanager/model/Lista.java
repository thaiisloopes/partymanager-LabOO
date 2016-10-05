package com.algaworks.partymanager.model;

import javax.persistence.*;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name="Lista")
public class Lista {
	
	private int idLista;
	
	@NotBlank(message = "Descrição é obrigatório!")
	private String descricao;
	
	@NotBlank(message = "Evento é obrigatório!")
	private int idEvento;
	
	@NotBlank(message = "Convidado é obrigatório!")
	private int idConvidado;
	
	@NotBlank(message = "Presente é obrigatório!")
	private int idPresente;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getIdEvento() {
		return idEvento;
	}

	public void setIdEvento(int idEvento) {
		this.idEvento = idEvento;
	}

	public int getIdConvidado() {
		return idConvidado;
	}

	public void setIdConvidado(int idConvidado) {
		this.idConvidado = idConvidado;
	}

	public int getIdPresente() {
		return idPresente;
	}

	public void setIdPresente(int idPresente) {
		this.idPresente = idPresente;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getIdLista() {
		return idLista;
	}
	public void setIdLista(int idLista) {
		this.idLista = idLista;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idLista;
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
		Lista other = (Lista) obj;
		if (idLista != other.idLista)
			return false;
		return true;
	}

}
