package com.cojanfabio.enteties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="artisti")
public class Artista {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String nome_artista;
/////////////////////////////////////////////////////	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome_artista() {
		return nome_artista;
	}
	public void setNome_artista(String nome_artista) {
		this.nome_artista = nome_artista;
	}
	
	
	
}
