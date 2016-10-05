package com.algaworks.partymanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.algaworks.partymanager.model.Presente;
import com.algaworks.partymanager.repository.Presentes;

@Service
public class CadastroPresenteService {
	
	@Autowired
	private Presentes presentes;
	
	public void Salvar(Presente presente){
		//pode escrever regras de negócio aqui...
		this.presentes.save(presente);
	}
}
