package com.example.demo.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

import com.example.demo.model.userDetails;

@Repository
public interface UserRepository extends CrudRepository<userDetails, String> {

	Optional<userDetails> findByEmail(String email);


	Optional<userDetails> findByuserName(String username);






}
