package com.polarbookshop.edgeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EdgeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EdgeServiceApplication.class, args);
		System.out.println("CATALOG_SERVICE_URI is set to: " + System.getenv("CATALOG_SERVICE_URI"));
	}

}
