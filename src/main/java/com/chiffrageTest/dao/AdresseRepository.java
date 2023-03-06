package com.chiffrageTest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chiffrageTest.entities.AdresseClient;

public interface AdresseRepository extends JpaRepository<AdresseClient, Long> {

}
