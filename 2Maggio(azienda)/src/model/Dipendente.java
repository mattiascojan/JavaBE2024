package model;

public class Dipendente {
	
	public static int matricolatore=1; //lo uso per dare il numero di matricola
	private int matricola;
	private String nome;
	private String cognome;
	private String ruolo;
	private double stipendio=1000;
	
///////////////////////////////////////////////////////////////////////////
	public Dipendente(String nome, String cognome, String ruolo) {
		this.nome = nome;
		this.cognome = cognome;
		this.ruolo = ruolo;
		this.matricola=matricolatore++;// do alla matricola il valore attuale del matricolatore ed essa sale di uno
	}
	
///////////////////////////////////////////////////////////////////////////	
	public int getMatricola() {
		return matricola;
	}
	public String getNome() {
		return nome;
	}
	public String getCognome() {
		return cognome;
	}
	public double getStipendio() {
		return stipendio;
	}
	// sopra non ci servono i setters, solo i getters
	public String getRuolo() {
		return ruolo;
	}
	public void setRuolo(String ruolo) {
		this.ruolo=ruolo;
	}// qua ci serve anche il setter
	
//////////////////////////////////////////////////////////////////////////
	public double calcolaStipendio(double moltiplicatore) {
		this.stipendio*=moltiplicatore;
		return this.stipendio;
	}	//*= è come mettere =se stesso per la parte dx
	
	public String presentati() {
		String presentazione=this.nome+" "+this.cognome+" -matricola:"+this.matricola;
		return presentazione;
	}
	
}
