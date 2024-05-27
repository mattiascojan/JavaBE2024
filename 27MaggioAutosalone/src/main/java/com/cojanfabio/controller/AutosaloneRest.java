package com.cojanfabio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cojanfabio.entities.Automobile;
import com.cojanfabio.service.AutosaloneService;

@RestController
@RequestMapping("api")
public class AutosaloneRest {
	
	@Autowired
	private AutosaloneService service;
	
	@GetMapping("cars")
	List<Automobile> getAutomobili(){
		return service.getAutomobili();
	}
	@PostMapping("cars")
	Automobile addAutomobile(@RequestBody Automobile a) {
		return service.addAutomobile(a);
	}
	
	
	
	
	
	
}
