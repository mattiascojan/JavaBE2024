package com.cojanfabio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cojanfabio.entity.Prenotazione;
import com.cojanfabio.service.ServicePrenotazione;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/prenotazione")
@Tag(name="Gestione prenotazioni", description="API per la gestione delle prenotazioni")
public class PrenotazioneREST {

	@Autowired
	private ServicePrenotazione service;
	
	//////////////////////////////
	
	//get all e getBy
	@GetMapping("/getAll")
	public List<Prenotazione> getAll(){
		return service.getAll();
	}
	
	@GetMapping("/getBy/tour/id")
	public List<Prenotazione> getByTourId(@RequestParam int id) {
		return service.getByTourId(id);
	}
	@GetMapping("/getBy/utente/id")
	public List<Prenotazione> getByUtenteId(@RequestParam int id) {
		return service.getByUtenteId(id);
	}
	@GetMapping("/getBy/data")
	public List<Prenotazione> getByData(@RequestParam String data) {
		return service.getByBookingDate(data);
	}
	
	//////////////////////////////
	
	//add e delete
	@PostMapping("/add/prenotazione")
	public void aggiungiPrenotazione(@RequestBody Prenotazione prenotazione) {
		service.addPrenotazioni(prenotazione);
	}
	@DeleteMapping("/delete/prenotazione")
	public void eliminaPrenotazione(@RequestParam int id) {
		service.deletePrenotazione(id);
	}

	//modify
	@PutMapping("/modify/prenotazione")
	private void modifyUtente(@RequestParam int id, @RequestBody Prenotazione prenotazione) {
		service.modifyPrenotazione(id, prenotazione);
	}
	
}
