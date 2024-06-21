package com.cojanfabio.enteties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="playlistBrano")
public class PlaylistBrano {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private long brano_id;
	private long playlist_id;
/////////////////////////////////////////////////////	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getBrano_id() {
		return brano_id;
	}
	public void setBrano_id(long brano_id) {
		this.brano_id = brano_id;
	}
	public long getPlaylist_id() {
		return playlist_id;
	}
	public void setPlaylist_id(long playlist_id) {
		this.playlist_id = playlist_id;
	}
/////////////////////////////////////////////////////////
	public PlaylistBrano(long brano_id, long playlist_id) {
		this.brano_id = brano_id;
		this.playlist_id = playlist_id;
	}
	
	
	
	
	
}
