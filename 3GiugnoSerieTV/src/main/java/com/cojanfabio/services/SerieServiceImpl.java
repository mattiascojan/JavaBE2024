package com.cojanfabio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cojanfabio.enteties.SerieTv;
import com.cojanfabio.repos.SerieDAO;

@Service
public class SerieServiceImpl implements SerieService{

	@Autowired
	private SerieDAO dao;
	
	@Override
	public List<SerieTv> getSerieTV() {
		return dao.findAll();
	}

	@Override
	public SerieTv getSerieByID(int id) {
		return dao.getReferenceById(id);
	}

	@Override
	public SerieTv addSerieTV(SerieTv serie) {
		return dao.save(serie);
	}
	
	
}
