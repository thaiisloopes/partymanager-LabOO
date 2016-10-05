package com.algaworks.partymanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.algaworks.partymanager.model.Convidado;
import com.algaworks.partymanager.repository.Convidados;

@Service
public class CadastroConvidadoService {
	
	@Autowired
	private Convidados convidados;
	
	public void Salvar(Convidado convidado){
		//pode escrever regras de negócio aqui...
		this.convidados.save(convidado);
	}
}
