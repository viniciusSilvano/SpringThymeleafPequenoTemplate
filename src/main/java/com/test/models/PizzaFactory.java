/**
 * 
 */
package com.test.models;

import com.test.util.PizzasEnum;

/**
 * @author vinicius silvano
 *
 */
public class PizzaFactory implements BasePizzaFactory {

	@Override
	public Pizza createPizza(PizzasEnum type) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		Pizza pizza;
		switch(type) {
		case CHESSE:
			pizza = new ChessePizza();
			break;
		case PEPPERONI:
			pizza =  new PepperoniPizza();
			break;
		case VEGGIE:
			pizza = new VeggiePizza();
		default:
			throw new IllegalArgumentException("Invalid Pizza Type");
			
		}
        pizza.addIngredients();
        pizza.bakePizza();
		return pizza;
	}

}
