package com.cojanfabio.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cojanfabio.entity.Tour;
import com.cojanfabio.repository.ToursDAO;

@Service
public class ServiceTour {

	@Autowired
	private ToursDAO dao;
	
	//////////////////////////////
	
	//get all e getBy
	public List<Tour> getAll(){
		return dao.findAll();
	}
	
	public Optional<Tour> getById(int id){
		return dao.findById(id);
	}
	public Tour getByName(String nome){
		return dao.findByName(nome);
	}
	public List<Tour> getByTipo(String tipo) {
		return dao.findByType(tipo);
	}
	public List<Tour> getByCapacita(int capacita) {
		return dao.findByCapacity(capacita);
	}
	public List<Tour> getByDisponibilita(boolean disponibilita) {
		return dao.findByAvailability(disponibilita);
	}
	
	//////////////////////////////
	
	//add e delete
	public void addTour(Tour tour) {
		dao.save(tour);
	}
	public void deleteTour(int id) {
		dao.deleteById(id);;
	}
	
	//modify
	public void modifyTour(int id, Tour tour) {
		deleteTour(id);
		addTour(tour);
	}
	
}
