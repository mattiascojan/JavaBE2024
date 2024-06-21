package com.cojanfabio.enteties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="playlists")
public class Playlist {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String nome;
	private long utente_id;
///////////////////////////////////////////////////////////////	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public long getUtente_id() {
		return utente_id;
	}
	public void setUtente_id(long utente_id) {
		this.utente_id = utente_id;
	}
//////////////////////////////////////////////
	public Playlist(String nome, long utente_id) {
		this.nome = nome;
		this.utente_id = utente_id;
	}
	
	
	
}
