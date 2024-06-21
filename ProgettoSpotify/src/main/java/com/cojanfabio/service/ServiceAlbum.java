package com.cojanfabio.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.cojanfabio.enteties.Album;
import com.cojanfabio.repos.AlbumsDAO;

import jakarta.persistence.Entity;

@Entity
public class ServiceAlbum {

	@Autowired
	private AlbumsDAO dao;
	
	
	public Album getAlbum(long id) {
		return dao.findById(id).get();
	}
	
	
}
