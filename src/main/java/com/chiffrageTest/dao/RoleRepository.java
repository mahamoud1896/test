package com.chiffrageTest.dao;


import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chiffrageTest.entities.Role;



@Repository
@Transactional
public interface RoleRepository extends JpaRepository<Role, Long> {
	
	//public static final EntityManager entityManager = null;

	//List<String> getRoleNames(Long id);
	
	Role findByRoleName(String roleName);
	
	

   // @Override
  //  void delete(Role role);
	

}
