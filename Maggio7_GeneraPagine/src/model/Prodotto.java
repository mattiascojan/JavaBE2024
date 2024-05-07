package model;

import util.GeneraDati;

public class Prodotto implements GeneraDati{
	
	private long id;
	private String marca;
	private String codice;
	private double prezzo;
/////////////////////////////////////////////////////////////
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getCodice() {
		return codice;
	}
	public void setCodice(String codice) {
		this.codice = codice;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
//////////////////////////////////////////////////////
	@Override
	public String generaHTML() {
		String html="<hl>"+this.marca+"</h1>";
		html+="<p> id: "+this.id+"</p>";
		html+="<p> codice: "+this.codice+"</p>";
		html+="<p> prezzo: "+this.prezzo+"</p>";
		return html;
	}
	@Override
	public String generaXML() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String generaJson() {
		String json="{ 'id: '"+this.id+"', 'marca '"+this.marca+"', 'prezzo: '"+this.prezzo+"'}";
		return json;
	}
	@Override
	public String generaTXT(String nota) {
		String testo=nota;
		return testo;
	}
	
	
	
	
	
	
}
