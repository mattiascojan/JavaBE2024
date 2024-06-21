package com.cojanfabio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cojanfabio.enteties.PlaylistBrano;
import com.cojanfabio.repos.PlaylistBranoDAO;

import jakarta.persistence.Entity;

@Entity
public class ServicePlaylistBrano {

	@Autowired
	private PlaylistBranoDAO dao;
	
	public void aggiungiBrano(long idPlaylist, long idBrano) {
		PlaylistBrano pl=new PlaylistBrano(idBrano, idPlaylist);
		dao.save(pl);
	}
	
	public void eliminaBrano(long id) {
		dao.deleteById(id);
	}
	
	public List<PlaylistBrano> getAllPlaylistBrano(){
		return dao.findAll();
	}
	
	
	
}
