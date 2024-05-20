package database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import model.Pokemon;

public class PokemonDAOImpl implements PokemonDAO {

	private Connessione miaConn=new Connessione();
	private Statement istruzionePerDB;
	private ResultSet risultatiDB;
	
	private Map<Integer, Pokemon> mappa=new HashMap<>();
////////////////////////////////////////////////////////////
	
	public PokemonDAOImpl() {
		miaConn=new Connessione();
		mappa=new HashMap<>();
		this.getPokemon();
	}
	
	@Override
	public List<Pokemon> getAllPokemon() {
		
		return new ArrayList<>(mappa.values());
	}
	
	@Override
	public Map<Integer, Pokemon> getPokemon() {
		try {
			this.istruzionePerDB=miaConn.getConn().createStatement();
			this.risultatiDB=this.istruzionePerDB.executeQuery(FINDALL);
			while(risultatiDB.next()) {
				int id=risultatiDB.getInt(1);
				String nome=risultatiDB.getString(2);
				String type1=risultatiDB.getString(3);
				String type2=risultatiDB.getString(4);
				Pokemon p=new Pokemon(id, nome, type1, type2);
				mappa.put(id, p);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Pokemon> getAllPokemonByType(String type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pokemon getPokemonById(int id) {
		return mappa.get(id);
	}

	@Override
	public List<String> getTipiPokemon() {
		Set<String> tipi=new TreeSet<String>();
		for(Pokemon p:getAllPokemon()) {
			tipi.add(p.getType1());
			if(!p.getType2().isEmpty()) {
				tipi.add(p.getType2());
			}
		}
		return new ArrayList<String>(tipi);
	}

}
