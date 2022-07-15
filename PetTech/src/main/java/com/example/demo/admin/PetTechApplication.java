package com.example.demo.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example.demo")
public class PetTechApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetTechApplication.class, args);
	}

}
