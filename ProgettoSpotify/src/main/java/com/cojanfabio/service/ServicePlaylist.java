package com.cojanfabio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cojanfabio.enteties.Playlist;
import com.cojanfabio.enteties.PlaylistBrano;
import com.cojanfabio.repos.PlaylistBranoDAO;
import com.cojanfabio.repos.PlaylistDAO;

@Service
public class ServicePlaylist {

	@Autowired
	private PlaylistDAO dao;
	
	@Autowired
	private PlaylistBranoDAO daoB;
	
	
	public Playlist getPlaylistByID(long id) {
		return dao.findById(id).get();
	}
	
	public void eliminaPlaylist(long id){
		dao.deleteById(id);
		List<PlaylistBrano> playlistBrani=daoB.findAll();
		for (PlaylistBrano playlistBrano : playlistBrani) {
			long idd=playlistBrano.getPlaylist_id();
			if(idd==id) {
				daoB.deleteById(idd);
			}
		}
	}
	
	public void nuovaPlaylist(String nome, long id) {
		Playlist pl=new Playlist(nome, id);
		dao.save(pl);
	}
	
	
}
