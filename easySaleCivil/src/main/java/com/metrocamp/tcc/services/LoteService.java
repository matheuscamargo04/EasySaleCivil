package com.metrocamp.tcc.services;

import java.util.List;

import org.springframework.stereotype.Service;
import com.metrocamp.tcc.models.Lotes;

@Service
public interface LoteService {
	
	public List<Lotes> findAll();

	public Lotes findOne(Long id);

	public String save(Lotes lote);

	public void deleteById(Long id);

	public void delete(Lotes lote);
	
	public boolean exists(Long id);
	
	public Long count();

	
}
