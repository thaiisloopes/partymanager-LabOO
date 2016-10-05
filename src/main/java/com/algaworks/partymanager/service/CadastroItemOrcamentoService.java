package com.algaworks.partymanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.algaworks.partymanager.model.ItemOrcamento;
import com.algaworks.partymanager.repository.ItensOrcamento;

@Service
public class CadastroItemOrcamentoService {
	
	@Autowired
	private ItensOrcamento itensOrcamento;
	
	public void Salvar(ItemOrcamento itemOrcamento){
		//pode escrever regras de negócio aqui...
		this.itensOrcamento.save(itemOrcamento);
	}
}
