package com.cojanfabio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cojanfabio.entity.Tour;

public interface ToursDAO extends JpaRepository<Tour, Integer> {

	//tutti i find by
	Tour findByName(String nome);
	List<Tour> findByType(String tipo);
	List<Tour> findByCapacity(int capacita);
	List<Tour> findByAvailability(boolean disponibilita);
	
}
