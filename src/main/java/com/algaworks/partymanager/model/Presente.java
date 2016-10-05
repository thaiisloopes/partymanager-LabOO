package com.algaworks.partymanager.model;

import javax.persistence.*;

import org.hibernate.validator.constraints.NotBlank;


@Entity
@Table(name="Presente")
public class Presente {

	private int idPresente;
	
	@NotBlank(message = "Descrição é obrigatório!")
	private String descricao;
	
	private String link;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getIdPresente() {
		return idPresente;
	}
	public void setIdPresente(int idPresente) {
		this.idPresente = idPresente;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idPresente;
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
		Presente other = (Presente) obj;
		if (idPresente != other.idPresente)
			return false;
		return true;
	}

}
