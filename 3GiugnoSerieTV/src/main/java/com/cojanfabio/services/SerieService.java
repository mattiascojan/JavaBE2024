package com.cojanfabio.services;

import java.util.List;

import com.cojanfabio.enteties.SerieTv;

public interface SerieService {

	List<SerieTv> getSerieTV();
	SerieTv getSerieByID(int id);
	SerieTv addSerieTV(SerieTv serie);
	
}
