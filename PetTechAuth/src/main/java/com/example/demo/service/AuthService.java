package com.example.demo.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.dto.UserDto;
import com.example.demo.response.MessageResponse;

@Service
public interface AuthService  {

	ResponseEntity<Object> createUsers(UserDto userDto);

	ResponseEntity<Object> validateLoginParam(UserDto userDTO);

}
