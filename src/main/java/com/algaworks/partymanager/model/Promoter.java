package com.algaworks.partymanager.model;

import javax.persistence.*;

import org.hibernate.validator.constraints.NotBlank;


@Entity
@Table(name="Promoter")
public class Promoter {

	@NotBlank(message = "Nome é obrigatório!")
	private String nome;
	
	@Id
	@NotBlank(message = "CPF é obrigatório!")
	private String cpf;
	
	@NotBlank(message = "Email é obrigatório!")
	private String email;
	
	@NotBlank(message = "Senha é obrigatório!")
	private String senha;
	
	@NotBlank(message = "Endereço é obrigatório!")
	private String endereco;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
		
	
}
