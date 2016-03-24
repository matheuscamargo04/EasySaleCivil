package com.metrocamp.tcc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.metrocamp.tcc.models.Lotes;

@Repository("LotesDAO")
public interface LotesDAO extends JpaRepository<Lotes, Long>{

}
