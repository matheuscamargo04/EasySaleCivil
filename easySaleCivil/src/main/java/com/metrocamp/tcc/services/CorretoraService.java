package com.metrocamp.tcc.services;

import java.util.List;

import org.springframework.stereotype.Service;
import com.metrocamp.tcc.models.Corretora;

@Service
public interface CorretoraService {
	
	public List<Corretora> findAll();

	public Corretora findOne(Long id);

	public Long save(Corretora corretora);

	public void deleteById(Long id);

	public void delete(Corretora corretora);
	
	public boolean exists(Long id);
	
	public Long count();

}
