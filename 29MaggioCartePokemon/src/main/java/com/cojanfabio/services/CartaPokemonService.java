package com.cojanfabio.services;

import java.util.List;

import com.cojanfabio.entities.CartaPokemon;

public interface CartaPokemonService {
	
	List<CartaPokemon> getCards();
	CartaPokemon addCarta(CartaPokemon cp);
	
}
