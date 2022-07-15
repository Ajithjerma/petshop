package com.example.demo.data.service.serviceImpl;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.data.model.userDetails;
import com.example.demo.data.repo.UserRepository;
import com.example.demo.data.response.service.UserDetailsImpl;
@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	@Autowired
	UserRepository userRepository;
	@Override
	@Transactional
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException  {
		Optional<userDetails> user = userRepository.findByuserName(username);
		if (user.isPresent()) {
			return UserDetailsImpl.build(user.get());
		}else {
			throw new UsernameNotFoundException("User Not Found with username: " + username);

		}
	
}
}