package com.cojanfabio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cojanfabio.entity.Utente;

public interface UtentiDAO extends JpaRepository<Utente, Integer> {

	//tutti i find by
	Utente findByEmail(String email);
	Utente findByUsername(String username);
	List<Utente> findByPassword(String password); //non penso vanga mai usato
	List<Utente> findByNome(String nome);
	List<Utente> findByCognome(String cognome);
	List<Utente> findByAmmi(boolean ammi);
	
}
