package com.test.models;

import java.util.List;

public class PepperoniPizza extends Pizza{
	
	public PepperoniPizza(List<Ingridient> ingridients) {
		super(ingridients);
	}
	
    @Override
    public void addIngredients() {
        System.out.println("Preparing ingredients for pepperoni pizza.");
    }
}
