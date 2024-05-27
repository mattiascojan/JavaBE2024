package com.cojanfabio.controller;

import java.lang.ProcessBuilder.Redirect;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.cojanfabio.entities.Automobile;
import com.cojanfabio.service.AutosaloneService;

@Controller
public class AutosaloneMVC {
	
	@Autowired
	private AutosaloneService service;
	
	@GetMapping("")
	public String home() {
		return "index";
	}
	
	@GetMapping("cars")
	public String getAutomobili(Model m) {
		m.addAttribute("cars",service.getAutomobili());
		return "elenco";
	}
	
	@PostMapping("cars")
	public String addAuto(Automobile a) {
		service.addAutomobile(a);
		return "redirect:cars";
	}
	
	
	
}
