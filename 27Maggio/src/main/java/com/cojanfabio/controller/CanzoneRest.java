package com.cojanfabio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cojanfabio.model.Canzone;
import com.cojanfabio.service.CanzoneService;

@RestController
public class CanzoneRest {

	@Autowired //spring ci da service solo quando ci serve
	private CanzoneService service;
	
	@GetMapping("api/canzoni")
	public List<Canzone> getCanzoni(){
		return service.getCanzoni();
	}
	
	
}
