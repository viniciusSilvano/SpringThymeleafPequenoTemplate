package com.test.models;

import java.util.List;

import com.test.util.PizzasEnum;

public class ChessePizza extends Pizza {
	

	public ChessePizza(List<Ingridient> ingridients, PizzasEnum name) {
		super(ingridients, name);
	}
	
	
    @Override
    public void addIngredients() {
        System.out.println("Preparing ingredients for cheese pizza.");
    }

	
}
