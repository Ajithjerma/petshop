package com.example.demo.auth.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.data.dto.UserDto;
import com.example.demo.data.response.MessageResponse;

@Service
public interface AuthService  {

	ResponseEntity<Object> createUsers(UserDto userDto);

	ResponseEntity<Object> validateLoginParam(UserDto userDTO);

}
