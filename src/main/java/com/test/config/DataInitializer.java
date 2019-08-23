package com.test.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.test.models.BasePizzaFactory;
import com.test.models.Pizza;
import com.test.util.PizzasEnum;

@Component
@Scope(scopeName = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class DataInitializer{

	private static final List<Pizza> PIZZAS = new ArrayList<Pizza>();
	
	private BasePizzaFactory pizzaFactory;
	
	
	
	public DataInitializer(BasePizzaFactory pizzaFactory) {
		super();
		this.pizzaFactory = pizzaFactory;
	}

	public void initiateData() {
		System.out.println("entrou");
		if(PIZZAS.isEmpty()) {
			System.out.println("initiating data instantiation"); 
			System.out.println(pizzaFactory);
			PIZZAS.add(pizzaFactory.createPizza(PizzasEnum.CHESSE));
			PIZZAS.add(pizzaFactory.createPizza(PizzasEnum.PEPPERONI));
			PIZZAS.add(pizzaFactory.createPizza(PizzasEnum.VEGGIE));
		}
		
	}

	public static List<Pizza> getPizzas() {
		return PIZZAS;
	}
	
}
