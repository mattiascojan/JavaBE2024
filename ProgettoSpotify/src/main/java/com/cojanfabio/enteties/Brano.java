package com.cojanfabio.enteties;

import java.sql.Date;
import java.sql.Time;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="brani")
public class Brano {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private String titolo;
	private Date data_pubblicazione;
	private Time durata;
	private long album_id;
	private long artista_id;
///////////////////////////////////////////////////
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
	public Date getData_pubblicazione() {
		return data_pubblicazione;
	}
	public void setData_pubblicazione(Date data_pubblicazione) {
		this.data_pubblicazione = data_pubblicazione;
	}
	public Time getDurata() {
		return durata;
	}
	public void setDurata(Time durata) {
		this.durata = durata;
	}
	public long getAlbum_id() {
		return album_id;
	}
	public void setAlbum_id(long album_id) {
		this.album_id = album_id;
	}
	public long getArtista_id() {
		return artista_id;
	}
	public void setArtista_id(long artista_id) {
		this.artista_id = artista_id;
	}
	
	
	
	
}
