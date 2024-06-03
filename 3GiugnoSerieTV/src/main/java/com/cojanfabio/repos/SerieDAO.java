package com.cojanfabio.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cojanfabio.enteties.SerieTv;

@Repository
public interface SerieDAO extends JpaRepository<SerieTv, Integer> {
	
}
