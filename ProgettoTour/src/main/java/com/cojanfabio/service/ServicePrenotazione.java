package com.cojanfabio.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cojanfabio.entity.Prenotazione;
import com.cojanfabio.repository.PrenotazioniDAO;

@Service
public class ServicePrenotazione {

	@Autowired
	private PrenotazioniDAO dao;
	
	//////////////////////////////
	
	//get all e getBy
	public List<Prenotazione> getAll(){
		return dao.findAll();
	}
	
	public Optional<Prenotazione> getById(int id){
		return dao.findById(id);
	}
	public List<Prenotazione> getByTourId(int id){
		return dao.findByTourId(id);
	}
	public List<Prenotazione> getByUtenteId(int id){
		return dao.findByUtenteId(id);
	}
	public List<Prenotazione> getByBookingDate(String data){
		return dao.findByBookingDate(data);
	}
	
	//////////////////////////////
	
	//add e delete
	public void addPrenotazioni(Prenotazione prenotazione) {
		dao.save(prenotazione);
	}
	public void deletePrenotazione(int id) {
		dao.deleteById(id);;
	}
		
	//modify
	public void modifyPrenotazione(int id, Prenotazione prenotazione) {
		deletePrenotazione(id);
		addPrenotazioni(prenotazione);
	}
	
	
}
