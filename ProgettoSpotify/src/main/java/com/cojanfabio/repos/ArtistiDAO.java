package com.cojanfabio.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cojanfabio.enteties.Artista;

public interface ArtistiDAO extends JpaRepository<Artista, Long> {

}
