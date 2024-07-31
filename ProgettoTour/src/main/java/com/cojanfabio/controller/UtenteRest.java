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

import com.cojanfabio.entity.Utente;
import com.cojanfabio.service.ServiceUtente;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/utente")
@Tag(name="Gestione utenti", description="API per la gestione degli utenti")
public class UtenteRest {

	@Autowired
	private ServiceUtente service;
	
	//////////////////////////////
	
	//get all e getBy
	@GetMapping("/getAll")
	public List<Utente> getAll(){
		return service.getAll();
	}
	
	@GetMapping("/getBy/id")
	public Optional<Utente> getById(@RequestParam int id) {
		return service.getById(id);
	}
	@GetMapping("/getby/email")
	public Utente getByEmail(@RequestParam String email) {
		return service.getByEmail(email);
	}
	@GetMapping("/getby/username")
	public Utente getByUsername(@RequestParam String username) {
		return service.getByUsername(username);
	}

	@GetMapping("/getby/password")
	public List<Utente> getByPassword(@RequestParam String password){
		return service.getByPassword(password);
	}
	@GetMapping("/getby/nome")
	public List<Utente> getByNome(@RequestParam String nome){
		return service.getByNome(nome);
	}
	@GetMapping("/getby/cognome")
	public List<Utente> getByCognome(@RequestParam String cognome){
		return service.getBycognome(cognome);
	}
	@GetMapping("/getby/ammi")
	public List<Utente> getByammi(@RequestParam boolean ammi){
		return service.getByAmmi(ammi);
	}
	
	//////////////////////////////
	
	//add e delete
	@PostMapping("/add/utente")
	public void aggiungiUtente(@RequestBody Utente utente) {
		service.addUtente(utente);
	}
	@DeleteMapping("/delete/utente")
	public void eliminaUtente(@RequestParam int id) {
		service.deleteUtente(id);
	}

	//modify
	@PutMapping("/modify/utente")
	private void modifyUtente(@RequestParam int id, @RequestBody Utente utente) {
		service.modifyUtente(id, utente);
	}
			
}
