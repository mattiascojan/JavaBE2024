package com.cojanfabio;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cojanfabio.entities.CartaPokemon;
import com.cojanfabio.services.CartaPokemonService;

@SpringBootTest
class ApplicationTests {
	
	@Autowired
	private CartaPokemonService service;
	
	@Test
	void addPokemon() {
		CartaPokemon cp=new CartaPokemon();
		cp.setHp(100);
		cp.setNome("Pikachu");
		cp.setTipo("Elettro");
		service.addCarta(cp);
	}
	@Test
	void getPokemon() {
		List<CartaPokemon> cards=service.getCards();
		System.out.println("Sono disponibili: "+cards.size()+" carte nel db.");
	}
	
}
