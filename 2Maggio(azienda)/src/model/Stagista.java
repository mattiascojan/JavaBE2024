package model;

public class Stagista extends Dipendente{
		
	private int moltiplicatore=3;
	
	public Stagista(String nome, String cognome, String ruolo) {
		super(nome, cognome, ruolo);
		calcolaStipendio(moltiplicatore); //uso un metodo nonappena creo un oggetto
	}
}
