package com.cojanfabio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cojanfabio.model.Canzone;
import com.cojanfabio.repos.CanzoneDAO;

@Service
public class CanzoneService {
	
	@Autowired //spring crea il dao quando ci serve
	private CanzoneDAO dao;
	
	public List<Canzone> getCanzoni(){
		return dao.findAll();//ci da tutte le canzoni del database
	}
	
	
}
