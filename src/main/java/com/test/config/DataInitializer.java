package com.test.config;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.test.models.BasePizzaFactory;
import com.test.models.Ingridient;
import com.test.models.Pizza;
import com.test.util.PizzasEnum;

@Component
@Scope(scopeName = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class DataInitializer{

	private static final List<Pizza> PIZZAS = new ArrayList<Pizza>();
	private static final Set<Ingridient> INGRIDIENTS = new HashSet<Ingridient>();
	private BasePizzaFactory pizzaFactory;
	
	
	
	public DataInitializer(BasePizzaFactory pizzaFactory) {
		super();
		this.pizzaFactory = pizzaFactory;
	}

	public void initiateData() {
		System.out.println("entrou");
		initiateIngridients();
		initiatePizzas();
	}
	
	private void initiateIngridients() {
		if(INGRIDIENTS.isEmpty()) {
			initiationMessage("ingridients");
			INGRIDIENTS.add(new Ingridient("Chesse"));
			INGRIDIENTS.add(new Ingridient("Salame"));
			INGRIDIENTS.add(new Ingridient("Vegetables"));
			initiationFinishMessage("Ingridients",INGRIDIENTS);
		}
	}
	
	private void initiatePizzas() {
		if(PIZZAS.isEmpty()) {
			
			initiationMessage("pizzas");			
			PIZZAS.add(pizzaFactory.createPizza(
					PizzasEnum.CHESSE,
					INGRIDIENTS.stream().filter(
							x -> x.getName().equals("Chesse")
					).collect(Collectors.toList())));
			PIZZAS.add(pizzaFactory.createPizza(
					PizzasEnum.PEPPERONI,
					INGRIDIENTS.stream().filter(
							x -> x.getName().equals("Salame")
					).collect(Collectors.toList())
					));
			PIZZAS.add(pizzaFactory.createPizza(
					PizzasEnum.VEGGIE,
					INGRIDIENTS.stream().filter(
							x -> x.getName().equals("Vegetables")
					).collect(Collectors.toList())
					));
			initiationFinishMessage("pizzas",PIZZAS);
		}
	}
	
	private void initiationMessage(String name) {
		System.out.println("initiating data instantiation of " + name); 
	}
	
	private <T> void  initiationFinishMessage(String name, Collection<T> collection) {
		System.out.println(name + " data:");
		System.out.println(collection);
		System.out.println();
	}

	public static List<Pizza> getPizzas() {
		return PIZZAS;
	}
	
	public static Set<Ingridient> getIngridients(){
		return INGRIDIENTS;
	}
	
}
