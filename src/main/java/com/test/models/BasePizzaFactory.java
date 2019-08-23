package com.test.models;

import org.springframework.stereotype.Component;

import com.test.util.PizzasEnum;

@Component
public interface BasePizzaFactory {
	public abstract Pizza createPizza(PizzasEnum type);
}
