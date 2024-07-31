package com.cojanfabio.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cojanfabio.entity.Tour;
import com.cojanfabio.service.ServiceTour;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/tour")
@Tag(name="Gestione tours", description="API per la gestione dei tours")
public class TourREST {

	@Autowired
	private ServiceTour service;
	
	//////////////////////////////
	
	//get all e getBy
	@GetMapping("/getAll")
	public List<Tour> getAll(){
		return service.getAll();
	}
	
	@GetMapping("/getBy/id")
	public Optional<Tour> getById(@RequestParam int id) {
		return service.getById(id);
	}
	@GetMapping("/getBy/nome")
	public Tour getByNome(@RequestParam String nome) {
		return service.getByName(nome);
	}
	@GetMapping("/getBy/tipo")
	public List<Tour> getByTipo(@RequestParam String tipo) {
		return service.getByTipo(tipo);
	}
	@GetMapping("/getBy/capacita")
	public List<Tour> getByNome(@RequestParam int capacita) {
		return service.getByCapacita(capacita);
	}
	@GetMapping("/getBy/disponibilita")
	public List<Tour> getByNome(@RequestParam boolean disponibilita) {
		return service.getByDisponibilita(disponibilita);
	}
	
	//////////////////////////////
	
	//add e delete
	@PostMapping("/add/tour")
	public void aggiungiTour(@RequestBody Tour tour) {
		service.addTour(tour);
	}
	@DeleteMapping("/delete/tour")
	public void eliminaTour(@RequestParam int id) {
		service.deleteTour(id);
	}

	//modify
	@PutMapping("/modify/tour")
	private void modifyTour(@RequestParam int id, @RequestBody Tour tour) {
		service.modifyTour(id, tour);
	}
	
}
