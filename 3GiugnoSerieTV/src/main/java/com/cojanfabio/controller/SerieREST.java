package com.cojanfabio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cojanfabio.enteties.SerieTv;
import com.cojanfabio.services.SerieService;

@RestController
@RequestMapping("api")
public class SerieREST {
	
	@Autowired
	private SerieService service;
	
	@GetMapping("serie")
	public List<SerieTv> getSerieTvs(){
		return service.getSerieTV();
	}

	@PostMapping("serie")
	public SerieTv addSerie(@RequestBody SerieTv serie) {
		return service.addSerieTV(serie);
	}
	
	
	
	
}
