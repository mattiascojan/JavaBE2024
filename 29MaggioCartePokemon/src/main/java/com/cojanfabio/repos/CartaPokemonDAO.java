package com.cojanfabio.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cojanfabio.entities.CartaPokemon;


public interface CartaPokemonDAO extends JpaRepository<CartaPokemon, Integer> {
	
	
	
}
