package database;

import java.util.List;
import java.util.Map;

import model.Pokemon;

public interface PokemonDAO {

	String FINDALL="SELECT id, Name, `Type 1`, `Type 2` FROM pokemon";
	
	List<Pokemon> getAllPokemon();
	Map<Integer, Pokemon> getPokemon();
	List<Pokemon> getAllPokemonByType(String type);
	Pokemon getPokemonById(int id);
	List<String> getTipiPokemon();
	
	
	
	
	
}
