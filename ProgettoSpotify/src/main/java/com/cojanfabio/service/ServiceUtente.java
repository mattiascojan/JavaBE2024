package com.cojanfabio.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.cojanfabio.enteties.Utente;
import com.cojanfabio.repos.UtenteDAO;

import jakarta.persistence.Entity;

@Entity
public class ServiceUtente {

	@Autowired
	private UtenteDAO dao;
	
	public Utente getUtenteByID(long id){
		return dao.findById(id).get();
	}
	
	public void nuovoUtente(String username, String email, String password) {
		Utente ut=new Utente(username, email, password);
		dao.save(ut);
	}

	
}
