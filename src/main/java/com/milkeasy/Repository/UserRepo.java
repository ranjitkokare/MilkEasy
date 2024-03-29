package com.milkeasy.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.milkeasy.Entity.User;

@EnableJpaRepositories
@Repository
public interface UserRepo extends JpaRepository<User, Integer>{
	Optional<User> findOneByRoleAndEmailAndPassword(String role, String email, String password);

	User findByEmail(String email);
	
	User findOneByEmailAndRole(String email, String role);

}	  

