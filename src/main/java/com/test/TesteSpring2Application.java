package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.test.config.DataInitializer;
import com.test.models.PizzaFactory;

@SpringBootApplication(scanBasePackages = "com.test.*")
public class TesteSpring2Application {
	
	public static void main(String[] args) {
		DataInitializer testData =	new DataInitializer(new PizzaFactory());
		testData.initiateData();
		SpringApplication.run(TesteSpring2Application.class, args);		
	}

}
