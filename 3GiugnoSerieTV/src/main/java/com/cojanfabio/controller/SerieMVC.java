package com.cojanfabio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.cojanfabio.enteties.SerieTv;
import com.cojanfabio.services.SerieService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class SerieMVC {
	
	@Autowired
	private SerieService service;
	
	@PostMapping("serie")
	public String addSerie(SerieTv serie) {
		service.addSerieTV(serie);
		return "redirect:client.html";
	}
	
	
	
	
}
