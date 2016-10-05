package com.algaworks.partymanager.model;

import javax.persistence.*;

import org.hibernate.validator.constraints.NotBlank;


@Entity
@Table(name="ItemOrcamento")
public class ItemOrcamento {

	private int idItemOrcamento;
	
	@NotBlank(message = "Descrição é obrigatório!")
	private String descricao;
	
	@NotBlank(message = "Valor é obrigatório!")
	private float valor;
	
	private int idEvento;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public int getIdEvento() {
		return idEvento;
	}

	public void setIdEvento(int idEvento) {
		this.idEvento = idEvento;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getIdItemOrcamento() {
		return idEvento;
	}
	public void setIdItemOrcamento(int idItemOrcamento) {
		this.idItemOrcamento = idItemOrcamento;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idItemOrcamento;
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
		ItemOrcamento other = (ItemOrcamento) obj;
		if (idItemOrcamento != other.idItemOrcamento)
			return false;
		return true;
	}
}
