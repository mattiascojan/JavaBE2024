package com.cojanfabio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cojanfabio.entity.Prenotazione;

public interface PrenotazioniDAO extends JpaRepository<Prenotazione, Integer> {

	List<Prenotazione> findByTourId(int tourId);
	List<Prenotazione> findByUtenteId(int utenteId);
	List<Prenotazione> findByBookingDate(String bookingDate);
	
}