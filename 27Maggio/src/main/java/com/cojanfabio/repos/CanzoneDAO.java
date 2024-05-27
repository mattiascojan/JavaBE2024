package com.cojanfabio.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cojanfabio.model.Canzone;

public interface CanzoneDAO extends JpaRepository<Canzone, Long>{
	
}