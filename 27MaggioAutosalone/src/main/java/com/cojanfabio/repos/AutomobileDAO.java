package com.cojanfabio.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cojanfabio.entities.Automobile;

@Repository
public interface AutomobileDAO extends JpaRepository<Automobile, Long> {
	
	
	
}
