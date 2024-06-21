package com.cojanfabio.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.cojanfabio.enteties.Brano;
import com.cojanfabio.repos.BranoDAO;

import jakarta.persistence.Entity;

@Entity
public class ServiceBrano {

	
	@Autowired
	private  BranoDAO dao;
	
	public Brano getBranoByID(long id) {
		return dao.findById(id).get();
	}	
	
}
