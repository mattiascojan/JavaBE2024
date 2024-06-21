package com.cojanfabio.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cojanfabio.enteties.Album;

public interface AlbumsDAO extends JpaRepository<Album, Long>{

}
