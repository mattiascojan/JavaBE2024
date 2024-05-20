package view;

import controller.PokemonCtrl;

public class ProvaPokemon {
	
	public static void main(String[] args) {
		
		PokemonCtrl controller=new PokemonCtrl();
		
//		controller
//			.getTipiPokemon()
//			.forEach(p -> System.out.println(p));
		
		controller
			.getNomiPokemon()
			.stream()
			.sorted() //mette in ordine alfabetico
			.forEach(p->System.out.println(p));
		
		
		
	}
}
