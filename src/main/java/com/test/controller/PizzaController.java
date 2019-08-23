package com.test.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.config.DataInitializer;
import com.test.models.Pizza;

@RestController
public class PizzaController {
	
	@GetMapping(value = "/pizzas")
	public ResponseEntity<List<Pizza>> getMethodName() {
		System.out.println(DataInitializer.getPizzas());
		return new ResponseEntity<List<Pizza>>(DataInitializer.getPizzas(), HttpStatus.OK);
	}

}
