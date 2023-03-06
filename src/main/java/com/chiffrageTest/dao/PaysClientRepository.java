package com.chiffrageTest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chiffrageTest.entities.PaysClient;

public interface PaysClientRepository extends JpaRepository<PaysClient, Long> {

}
