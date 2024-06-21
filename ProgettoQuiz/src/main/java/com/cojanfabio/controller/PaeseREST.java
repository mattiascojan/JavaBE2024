package com.cojanfabio.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cojanfabio.enteties.Domanda;
import com.cojanfabio.enteties.Paese;
import com.cojanfabio.service.PaeseService;

@RestController
public class PaeseREST {

	@Autowired
	private PaeseService service;
	
	@GetMapping("tuttipaesi")
	public List<Paese> getPaesi(){
		return service.getPaesi();
	}
	
	@GetMapping("paese/{id}")
	public Paese getStato(@PathVariable long id) {
		return service.getPaeseByID(id);
	}
	
	@GetMapping("domanda")
	@CrossOrigin
	public List<String> generaDomanda() {
		List<String> lista=new ArrayList<String>();
		Random r=new Random();
		long a=0, b=0, c=0;
		a=(r.nextLong(170))+1;
		Paese p1=getStato(a);
		Paese p2=new Paese();
		Paese p3=new Paese();
		lista.add(p1.getName());
		lista.add(p1.getCapital());
		 do {
			b=(r.nextLong(170))+1;
			p2=getStato(b);
		}while(b==a);
		do {
			c=(r.nextLong(170))+1;
			p3=getStato(c);
		}while(c==b||c==a);
		
		lista.add(p2.getCapital());
		lista.add(p3.getCapital());
		return lista;
	}
	
	
	@GetMapping("domandaDifficile")
	@CrossOrigin
	public List<String> generaDomandaDifficile() {
		List<String> lista=new ArrayList<String>();
		Random r=new Random();
		long a=0, b=0, c=0, d=0, e=0;
		a=(r.nextLong(170))+1;
		Paese p1=getStato(a);
		Paese p2=new Paese();
		Paese p3=new Paese();
		Paese p4=new Paese();
		Paese p5=new Paese();
		lista.add(p1.getName());
		lista.add(p1.getCapital());
		 do {
			b=(r.nextLong(170))+1;
			p2=getStato(b);
		}while(b==a);
		do {
			c=(r.nextLong(170))+1;
			p3=getStato(c);
		}while(c==b||c==a);
		do {
			d=(r.nextLong(170))+1;
			p4=getStato(d);
		}while(d==a||d==b||d==c);
		do {
			e=(r.nextLong(170))+1;
			p5=getStato(e);
		}while(e==a||e==b||e==c||e==d);
		
		lista.add(p2.getCapital());
		lista.add(p3.getCapital());
		lista.add(p4.getCapital());
		lista.add(p5.getCapital());
		return lista;
	}
	
	
}
