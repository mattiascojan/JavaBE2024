package controller;

import java.util.ArrayList;

import model.Dipendente;
import model.Manager;
import model.Programmatore;
import model.Stagista;

public class AziendaController {
		
	public String nomeAzienda;
	private int numDipendenti;
	private ArrayList<Dipendente> listaDipendenti;
	
///////////////////////////////////////////////////////////////	
	public AziendaController(String nomeAzienda) {
		this.nomeAzienda = nomeAzienda;
		this.listaDipendenti = new ArrayList<>();
	}
///////////////////////////////////////////////////////////////
	public ArrayList<Dipendente> getListaDipendenti() {
		return listaDipendenti;
	} // il set non mi serve
	
///////////////////////////////////////////////////////////////	
	public void addDipendente(String nome, String cognome, String ruolo) {
		Dipendente d=null;
		switch (ruolo) {
			case "Manager":
				d=new Manager(nome, cognome, ruolo);
				break;
			case "Programmatore":
				d=new Programmatore(nome, cognome, ruolo);
				break;
			case "Stagista":
				d=new Stagista(nome, cognome, ruolo);
				break;
			default:
				System.out.println("errore, ruolo sbagliato");
		}
		
		if(d!=null) {
			this.listaDipendenti.add(d);
		}
	}
	
}
