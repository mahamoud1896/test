package com.chiffrageTest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TypeProjetRepository extends JpaRepository<com.chiffrageTest.entities.TypeProjet, Long> {

}
