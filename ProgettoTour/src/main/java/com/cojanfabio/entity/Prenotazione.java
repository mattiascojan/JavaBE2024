package com.cojanfabio.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="prenotazioni")
public class Prenotazione {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="tourId")
	private int tourId;
	@Column(name="utenteId")
	private int utenteId;
	@Column(name="bookingDate")
	private String bookingDate;
	
	//////////////////////////////////
	
	//getters e setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getTourId() {
		return tourId;
	}
	public void setTourId(int tourId) {
		this.tourId = tourId;
	}
	
	public int getUtenteId() {
		return utenteId;
	}
	public void setUtenteId(int utenteId) {
		this.utenteId = utenteId;
	}
	
	public String getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}
	
	
}
