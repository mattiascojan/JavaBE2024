package com.cojanfabio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cojanfabio.entities.Automobile;
import com.cojanfabio.repos.AutomobileDAO;

@Service
public class AutosaloneServiceImpl implements AutosaloneService {
	
	@Autowired
	private AutomobileDAO dao;
////////////////////////////////////////////////
	@Override
	public List<Automobile> getAutomobili() {
		return dao.findAll();
	}

	@Override
	public List<Automobile> getAutomobiliByMarca(String marca) {
		
		return null;
	}

	@Override
	public List<Automobile> getAutomobiliByPrezzo(double min, double max) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Automobile getAutomobileById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

////////////////////////////////////////////////
	@Override
	public Automobile addAutomobile(Automobile a) {
		return dao.save(a);
	}
	@Override
	public Automobile updateAutomobile(Automobile a) {
		return dao.save(a);
	}
	@Override
	public void deleteAutomobile(Automobile a) {
		dao.delete(a);
	}

}
