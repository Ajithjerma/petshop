package com.example.demo.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example.demo")
public class PetTechAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetTechAuthApplication.class, args);
	}

}
