package com.cojanfabio.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.cojanfabio.enteties.Artista;
import com.cojanfabio.repos.ArtistiDAO;

import jakarta.persistence.Entity;

@Entity
public class ServiceArtista {

	@Autowired
	private ArtistiDAO dao;
	
	public Artista getArtista(long id) {
		return dao.findById(id).get();
	}
	
	
	
}
