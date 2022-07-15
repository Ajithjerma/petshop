package com.example.demo.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example.demo")
public class PetTechUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetTechUserApplication.class, args);
	}

}
