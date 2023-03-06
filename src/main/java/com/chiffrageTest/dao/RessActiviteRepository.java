package com.chiffrageTest.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.chiffrageTest.entities.RessActivite;

public interface RessActiviteRepository extends JpaRepository<RessActivite, Long> {
	
	
	@Query(value="select AVG(duree) from ress_activite",
			nativeQuery=true)
	List<Object> dureeMoyen();

}
