package com.test.models;

import java.util.List;

public class ChessePizza extends Pizza {
	

	public ChessePizza(List<Ingridient> ingridients) {
		super(ingridients);
	}
	
	
    @Override
    public void addIngredients() {
        System.out.println("Preparing ingredients for cheese pizza.");
    }

	
}
