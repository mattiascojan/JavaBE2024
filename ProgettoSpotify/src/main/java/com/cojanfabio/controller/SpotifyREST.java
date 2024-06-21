package com.cojanfabio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.cojanfabio.enteties.Album;
import com.cojanfabio.enteties.Artista;
import com.cojanfabio.enteties.Brano;
import com.cojanfabio.enteties.Playlist;
import com.cojanfabio.enteties.PlaylistBrano;
import com.cojanfabio.enteties.Utente;
import com.cojanfabio.service.ServiceAlbum;
import com.cojanfabio.service.ServiceArtista;
import com.cojanfabio.service.ServiceBrano;
import com.cojanfabio.service.ServicePlaylist;
import com.cojanfabio.service.ServicePlaylistBrano;
import com.cojanfabio.service.ServiceUtente;



@Controller
public class SpotifyREST {
	
	@Autowired
	private ServiceUtente serviceUtente;
	@Autowired
	private ServicePlaylist servicePlaylist;
	@Autowired
	private ServiceArtista serviceArtista;
	@Autowired
	private ServiceAlbum serviceAlbum;
	@Autowired
	private ServiceBrano serviceBrano;
	@Autowired
	private ServicePlaylistBrano servicePlaylistBrano;
//////////////////////////////////////////////////////////////
	//getters, per usare in front end
	@GetMapping("utente/{id}")
	public Utente getUtenteByID(@PathVariable long id) {
		return serviceUtente.getUtenteByID(id);
	}
	@GetMapping("album/{id}")
	public Album getAlbumByID(@PathVariable long id) {
		return serviceAlbum.getAlbum(id);
	}
	@GetMapping("artista/{id}")
	public Artista getArtistaByID(@PathVariable long id) {
		return serviceArtista.getArtista(id);
	}
	@GetMapping("brano/{id}")
	public Brano getBranoByID(@PathVariable long id) {
		return serviceBrano.getBranoByID(id);
	}
	@GetMapping("playlist/{id}")
	public Playlist getPlaylistByID(@PathVariable long id) {
		return servicePlaylist.getPlaylistByID(id);
	}
//////////////////////////////////////////////////////////////////////
	//cambio dati nel db
	@PostMapping("creautente")
	public void addUtente(Utente utente) {
		serviceUtente.nuovoUtente(utente.getUsername(), utente.getEmail(), utente.getPassword());
	}
	@PostMapping("aggiungibranoplaylist")
	public void aggiungiPlaylistBrano(PlaylistBrano pb) {
		servicePlaylistBrano.aggiungiBrano(pb.getPlaylist_id(), pb.getBrano_id());
	}
	@PostMapping("aggiungiPlaylist")
	public void aggiungiPlaylist(Playlist pl) {
		servicePlaylist.nuovaPlaylist(pl.getNome(), pl.getUtente_id());
	}
/////////////////////////////////////////////////////////////////////////
	//elimino alcuni dati
	@PostMapping("elimincabranodallaplaylist")
	public void eliminaBranoDaPlaylist(PlaylistBrano pb) {
		List<PlaylistBrano> playlistBranos=servicePlaylistBrano.getAllPlaylistBrano();
		for (PlaylistBrano playlistBrano : playlistBranos) {
			if((playlistBrano.getBrano_id()==pb.getBrano_id())&&(playlistBrano.getPlaylist_id()==pb.getPlaylist_id())) {
				servicePlaylistBrano.eliminaBrano(playlistBrano.getId());
			}
		}
	}
	@PostMapping("eliminaplaylist/{id}")
	public void eliminaPlaylist(@PathVariable long id) {
		servicePlaylist.eliminaPlaylist(id);
	}
////////////////////////////////////////////////////////////////////////////	
	
	
	
}
