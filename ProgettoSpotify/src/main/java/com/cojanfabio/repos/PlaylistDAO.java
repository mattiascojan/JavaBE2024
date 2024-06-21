package com.cojanfabio.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cojanfabio.enteties.Playlist;

public interface PlaylistDAO extends JpaRepository<Playlist, Long> {

}
