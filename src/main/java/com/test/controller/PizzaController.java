package com.test.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.DTO.PizzaDTO;
import com.test.config.DataInitializer;

@RestController
public class PizzaController {
	
	@GetMapping(value = "/pizzas")
	public ResponseEntity<List<PizzaDTO>> getMethodName() {
		System.out.println(DataInitializer.getPizzas());
		return new ResponseEntity<List<PizzaDTO>>(DataInitializer.getPizzas(), HttpStatus.OK);
	}

}
