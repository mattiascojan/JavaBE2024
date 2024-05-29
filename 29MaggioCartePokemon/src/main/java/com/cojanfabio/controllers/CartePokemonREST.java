package com.cojanfabio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cojanfabio.entities.CartaPokemon;
import com.cojanfabio.services.CartaPokemonService;

@RestController
@RequestMapping("api")
public class CartePokemonREST {
	
	@Autowired
	CartaPokemonService service;
	
	@GetMapping("cards")
	public List<CartaPokemon> getall(){
		return service.getCards();
	}
	
	@PostMapping("cards")
	public CartaPokemon addCard(@RequestBody CartaPokemon cp) {
		return service.addCarta(cp);
	}
	
	
}
