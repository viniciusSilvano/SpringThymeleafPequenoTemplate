package com.test.models;

import java.util.List;

public class VeggiePizza extends Pizza {
	public VeggiePizza(List<Ingridient> ingridients) {
		super(ingridients);
	}
	
    @Override
    public void addIngredients() {
        System.out.println("Preparing ingredients for veggie pizza.");
    }
}
