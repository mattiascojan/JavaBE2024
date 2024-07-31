package com.cojanfabio.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cojanfabio.entity.Utente;
import com.cojanfabio.repository.UtentiDAO;

@Service
public class ServiceUtente {

	@Autowired
	private UtentiDAO dao;
	
	//////////////////////////////
	
	//get all e getBy
	public List<Utente> getAll(){
		return dao.findAll();
	}
		
	public Optional<Utente> getById(int id){
		return dao.findById(id);
	}
	public Utente getByEmail(String email){
		return dao.findByEmail(email);
	}
	public Utente getByUsername(String username){
		return dao.findByUsername(username);
	}
	public List<Utente> getByPassword(String password){
		return dao.findByPassword(password);
	}
	public List<Utente> getByNome(String nome){
		return dao.findByNome(nome);
	}
	public List<Utente> getBycognome(String cognome){
		return dao.findByCognome(cognome);
	}
	public List<Utente> getByAmmi(boolean ammi){
		return dao.findByAmmi(ammi);
	}	
		
	//////////////////////////////
		
	//add e delete
	public void addUtente(Utente utente) {
		dao.save(utente);
	}
	public void deleteUtente(int id) {
		dao.deleteById(id);;
	}
		
	//modify
	public void modifyUtente(int id, Utente utente) {
		deleteUtente(id);
		addUtente(utente);
	}
	
	
}
