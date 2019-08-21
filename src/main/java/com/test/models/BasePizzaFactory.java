package com.test.models;

import com.test.util.PizzasEnum;

public interface BasePizzaFactory {
	public abstract Pizza createPizza(PizzasEnum type);
}
