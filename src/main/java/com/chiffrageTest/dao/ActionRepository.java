package com.chiffrageTest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chiffrageTest.entities.Action;

@Repository
public interface ActionRepository extends JpaRepository<Action, Long> {
	
	//Action findActionByName(String name);

  //  @Override
  //  void delete(Action privilege);

}
