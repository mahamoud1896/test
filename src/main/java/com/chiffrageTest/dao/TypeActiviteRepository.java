package com.chiffrageTest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chiffrageTest.entities.TypeActivite;

@Repository
public interface TypeActiviteRepository extends JpaRepository<TypeActivite, Long> {

}
