package com.test.models;

import java.util.List;

import com.test.util.PizzasEnum;

public class VeggiePizza extends Pizza {
	public VeggiePizza(List<Ingridient> ingridients, PizzasEnum name) {
		super(ingridients, name);
	}
	
    @Override
    public void addIngredients() {
        System.out.println("Preparing ingredients for veggie pizza.");
    }
}
