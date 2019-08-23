package com.test.models;

import java.util.List;

import com.test.util.PizzasEnum;

public abstract class Pizza {
	
	private String name;
	private List<Ingridient> ingridients;
	
	public abstract void addIngredients();
	
	public Pizza(List<Ingridient> ingridients, PizzasEnum name) {
		super();
		this.ingridients = ingridients;
		this.name = name.getPizzaName();
	}

	public  void bakePizza() {
		System.out.println("Pizza baked at 400 for 20 minutes.");
	}
	
	public List<Ingridient> getIngridients() {
		return ingridients;
	}

	public void setIngridients(List<Ingridient> ingridients) {
		this.ingridients = ingridients;
	}

	public String getName() {
		return name;
	}

	public void setName(PizzasEnum name) {
		this.name = name.getPizzaName();
	}

	@Override
	public String toString() {
		return "Pizza [name=" + name + "]";
	}
	
}
