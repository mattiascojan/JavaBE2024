package com.cojanfabio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cojanfabio.entities.CartaPokemon;
import com.cojanfabio.repos.CartaPokemonDAO;

@Service
public class CartaPokemonServiceImpl implements CartaPokemonService {
	
	@Autowired
	private CartaPokemonDAO dao;
	
	@Override
	public List<CartaPokemon> getCards() {
		return dao.findAll();
	}
	
	@Override
	public CartaPokemon addCarta(CartaPokemon cp) {
		return dao.save(cp);
	}

}
