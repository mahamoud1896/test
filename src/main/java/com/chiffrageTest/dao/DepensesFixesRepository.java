package com.chiffrageTest.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.chiffrageTest.entities.DepensesFixes;
import com.chiffrageTest.entities.Profil;

public interface DepensesFixesRepository extends JpaRepository<DepensesFixes, Long> {
	
	@Query("SELECT d FROM DepensesFixes d WHERE CONCAT(d.libelle, ' ', d.montant) LIKE %?1%")
	List<DepensesFixes> searchDepense(String keyword);

}
