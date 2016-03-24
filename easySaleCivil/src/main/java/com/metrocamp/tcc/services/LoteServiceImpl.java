package com.metrocamp.tcc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.metrocamp.tcc.models.Lotes;
import com.metrocamp.tcc.repositories.LotesDAO;

@Transactional
@Service("pessoaService")
public class LoteServiceImpl implements LoteService{

	@Autowired
	private LotesDAO lotesDAO;
	
	@Override
	public List<Lotes> findAll() {
		return lotesDAO.findAll();
	}

	@Override
	public Lotes findOne(Long id) {
		return lotesDAO.findOne(id);
	}

	@Override
	public String save(Lotes lote) {
		lote = lotesDAO.save(lote);
		return lote.getCodLote();
	}

	@Override
	public void deleteById(Long id) {
		lotesDAO.delete(id);
	}

	@Override
	public void delete(Lotes lote) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean exists(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Long count() {
		// TODO Auto-generated method stub
		return null;
	}

}
