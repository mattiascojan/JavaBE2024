package com.cojanfabio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

//@table se ha nome diverso "canzoni"
@Entity
public class Canzone {

	
	@Id
	private long id;
	private String titolo;
	private String cantante;
	
////////////////////////////////////
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
