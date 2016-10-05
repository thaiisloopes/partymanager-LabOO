package com.algaworks.partymanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.algaworks.partymanager.model.Evento;
import com.algaworks.partymanager.repository.Eventos;

@Service
public class CadastroEventoService {
	
	@Autowired
	private Eventos eventos;
	
	public void Salvar(Evento evento){
		//pode escrever regras de negócio aqui...
		this.eventos.save(evento);
	}
}
