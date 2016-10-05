package com.algaworks.partymanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.algaworks.partymanager.model.Lista;
import com.algaworks.partymanager.repository.Listas;

@Service
public class CadastroListaService {
	
	@Autowired
	private Listas listas;
	
	public void Salvar(Lista lista){
		//pode escrever regras de negócio aqui...
		this.listas.save(lista);
	}
}
