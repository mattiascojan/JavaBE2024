package model;

public class Programmatore extends Dipendente {
	
	private int moltiplicatore=3;
	
	public Programmatore(String nome, String cognome, String ruolo) {
		super(nome, cognome, ruolo);
		calcolaStipendio(moltiplicatore); //uso un metodo nonappena creo un oggetto
	}

}
