package database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.Canzone;

public class CanzoneDAOImpl implements CanzoneDAO {
	
	private Connessione miaConn;
	private PreparedStatement ps; //contenitore per istruzion
	private ResultSet rs; //contenitore per risultati
	

	public CanzoneDAOImpl() {
		miaConn=new Connessione();
	}

	@Override
	public void addCanzone(Canzone c) {
		try {
			ps = miaConn.getConn().prepareStatement(ADD); //cerca i ? nella stringa del main per sostituirli
			ps.setString(1, c.getTitolo());
			ps.setString(2, c.getCantante());
			ps.execute(); //esegue il tutto
		} catch (Exception e) {
			e.printStackTrace();
		}
	}//aggiungiamo cose alla tabella

	@Override
	public List<Canzone> getCanzones() {
		List<Canzone> canzoni=new ArrayList<>();
		
		try {
			ps=miaConn.getConn().prepareStatement(FIND_ALL);
			rs=ps.executeQuery();
			while(rs.next()) {
				String titolo= rs.getString("titolo");
				String cantante= rs.getString("cantante");
				Canzone c=new Canzone(titolo, cantante);
				canzoni.add(c);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return canzoni;
	}// togliamo cose dalla tabella

}
