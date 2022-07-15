package com.example.demo.data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example.demo")
public class PetTechDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetTechDataApplication.class, args);
	}

}
