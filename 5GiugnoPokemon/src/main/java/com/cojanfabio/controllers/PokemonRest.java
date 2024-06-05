package com.cojanfabio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cojanfabio.enteties.PokemonPict;
import com.cojanfabio.services.PokemonService;

@RestController
@RequestMapping("api")
public class PokemonRest {
	
	@Autowired
	private PokemonService pokemonService;
	
	@GetMapping("pokepict")
	List<PokemonPict> getPictures(){
		return pokemonService.getPokePict();
	}
	
	@GetMapping("pokepict/{name}")
	public PokemonPict getPicture(@PathVariable String name){
		return pokemonService
				.getPokePict()
				.stream()
				.filter(p->p.getName().startsWith(name))
				.findFirst()
				.get();
	}
	
	
}
