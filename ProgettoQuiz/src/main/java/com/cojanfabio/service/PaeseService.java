package com.cojanfabio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cojanfabio.enteties.Paese;
import com.cojanfabio.repos.PaesiDAO;

@Service
public class PaeseService {

	@Autowired
	private PaesiDAO dao;
	
	public List<Paese> getPaesi(){
		return dao.findAll();
	}
	
	public Paese getPaeseByID(long id) {
		return dao.findById(id).get();
	}	
	
	
	
	
}
