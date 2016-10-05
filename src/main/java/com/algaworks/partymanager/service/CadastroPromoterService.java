package com.algaworks.partymanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.algaworks.partymanager.model.Promoter;
import com.algaworks.partymanager.repository.Promoters;

@Service
public class CadastroPromoterService {
	
	@Autowired
	private Promoters promoters;
	
	public void Salvar(Promoter promoter){
		//pode escrever regras de negócio aqui...
		this.promoters.save(promoter);
	}
}
