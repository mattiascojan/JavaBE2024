package com.cojanfabio.service;

import java.util.List;

import com.cojanfabio.entities.Automobile;

public interface AutosaloneService {
	
	List<Automobile> getAutomobili();
	List<Automobile> getAutomobiliByMarca(String marca);
	List<Automobile> getAutomobiliByPrezzo(double min, double max);
	
	Automobile getAutomobileById(long id);
	Automobile addAutomobile(Automobile a);
	Automobile updateAutomobile(Automobile a);
	
	void deleteAutomobile(Automobile a);
}