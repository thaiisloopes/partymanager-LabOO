package com.algaworks.partymanager.model;


import javax.persistence.*;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name="Evento")
public class Evento {
	
	@NotBlank(message = "Descrição é obrigatório!")
	private String descricao;
	
	@NotBlank(message = "Data é obrigatório!")
	private String data;
	
	@NotBlank(message = "Horário é obrigatório!")
	private String horario;
	
	@NotBlank(message = "Local é obrigatório!")
	private String local;
	
	@NotBlank(message = "Tipo é obrigatório!")
	private String tipo;
	
	@NotBlank(message = "Traje é obrigatório!")
	private String traje;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_evento;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTraje() {
		return traje;
	}

	public void setTraje(String traje) {
		this.traje = traje;
	}

	public Long getId_evento() {
		return id_evento;
	}
	public void setId_evento(Long id_evento) {
		this.id_evento = id_evento;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_evento == null) ? 0 : id_evento.hashCode());
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
		Evento other = (Evento) obj;
		if (id_evento == null) {
			if (other.id_evento != null)
				return false;
		} else if (!id_evento.equals(other.id_evento))
			return false;
		return true;
	}

}
