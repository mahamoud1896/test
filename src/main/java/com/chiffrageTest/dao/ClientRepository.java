package com.chiffrageTest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chiffrageTest.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

	
}
