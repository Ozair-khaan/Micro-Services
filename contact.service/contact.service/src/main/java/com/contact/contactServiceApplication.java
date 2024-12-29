package com.contact;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.contact")
public class contactServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(contactServiceApplication.class, args);
	}

}
