package com.cojanfabio.services;

import java.util.List;

import com.cojanfabio.enteties.PokemonPict;

public interface PokemonService {

	List<PokemonPict> getPokePict();
	PokemonPict getPokePict(String name);
	
}
