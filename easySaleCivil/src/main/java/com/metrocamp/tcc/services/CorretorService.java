package com.metrocamp.tcc.services;

import java.util.List;

import com.metrocamp.tcc.models.Corretor;

public interface CorretorService {
	
	public List<Corretor> findAll();

	public Corretor findOne(Long id);

	public Long save(Corretor corretor);

	public void deleteById(Long id);

	public void delete(Corretor corretor);
	
	public boolean exists(Long id);
	
	public Long count();
	
}
