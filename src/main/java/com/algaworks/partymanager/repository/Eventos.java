package com.algaworks.partymanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algaworks.partymanager.model.Evento;

public interface Eventos extends JpaRepository<Evento, Long>{

}
