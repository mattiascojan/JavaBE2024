package com.cojanfabio.enteties;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="albums")
public class Album {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private Date data_pubblicazione;
	private long artista_id;
///////////////////////////////////////////////////////////
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getData_pubblicazione() {
		return data_pubblicazione;
	}
	public void setData_pubblicazione(Date data_pubblicazione) {
		this.data_pubblicazione = data_pubblicazione;
	}
	public long getArtista_id() {
		return artista_id;
	}
	public void setArtista_id(long artista_id) {
		this.artista_id = artista_id;
	}
	
	
	
}
