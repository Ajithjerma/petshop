package com.example.demo.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.ERole;
import com.example.demo.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
//	Optional<Role> findByName(ERole roleAdmin);
	
	@Query(value="select p from Role p where p.name='ROLE_ADMIN' OR p.name='ROLE_MANAGER'" )
	Role findByName(ERole roleEmployee);

}