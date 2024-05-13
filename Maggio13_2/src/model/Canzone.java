package model;

public class Canzone {
	private String titolo;
	private String cantante;
	
	public Canzone(String titolo, String cantante) {
		super();
		this.titolo = titolo;
		this.cantante = cantante;
	}
	
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getCantante() {
		return cantante;
	}
	public void setCantante(String cantante) {
		this.cantante = cantante;
	}
	
	
	
}
