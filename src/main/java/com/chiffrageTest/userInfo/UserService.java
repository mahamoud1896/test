package com.chiffrageTest.userInfo;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chiffrageTest.dao.RessourceRepository;
import com.chiffrageTest.dao.RoleRepository;
import com.chiffrageTest.dao.UserRepository;
import com.chiffrageTest.entities.Profil;
import com.chiffrageTest.entities.Provider;
import com.chiffrageTest.entities.RessActivite;
import com.chiffrageTest.entities.Ressource;
import com.chiffrageTest.entities.Role;
import com.chiffrageTest.entities.User;
import com.chiffrageTest.service.IchiffrageService;


@Service
public class UserService {

	@Autowired
	private UserRepository repo;
	@Autowired
	private RessourceRepository repos;
	@Autowired
	private RoleRepository roleRepo;
	@Autowired
	private IchiffrageService ichiffrageService;
	
	
	public void processOAuthPostLogin(String username) {
		User existUser = repo.findByUsername(username);
		
		//Profil profil = ichiffrageService.getProfil(16L);
		
		//Long id = 3L;
		
		if (existUser == null) {
			User newUser = new User();
			//Ressource ress = new Ressource();
			//Profil profil = new Profil();
			newUser.setUsername(username);
			newUser.setProvider(Provider.GOOGLE);
			newUser.setActive(true);
			//ress.setUser(newUser);
			//ress.setNom(username);
			//ress.setPrenom(username);
			
			
			//Ressource ress = new Ressource();
			//ress.setNom(newUser.getUsername().substring(8, 13));
			//ress.setPrenom(newUser.getUsername().substring(0, 8));
			//ress.setProfil(profil);
			
			//repos.save(ress);
			
			//Role role = roleRepo.findByRoleName("User");
			//newUser.addRole(role);
			
			//ress.setTypeRessource("Ressource_Interne");
			//ress.setProfil(profil);
			repo.save(newUser);
			//repos.save(ress);
			
			System.out.println("Created new user: " + username);
		}
		
	}
	
	
	
	
	
}
