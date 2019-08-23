/**
 * 
 */
package com.test.models;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.test.util.PizzasEnum;

/**
 * @author vinicius silvano
 *
 */
@Scope(scopeName = ConfigurableBeanFactory.SCOPE_SINGLETON)
@Component("PizzaFactory")
@Primary
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
			break;
		default:
			throw new IllegalArgumentException("Invalid Pizza Type");
			
		}
        pizza.addIngredients();
        pizza.bakePizza();
		return pizza;
	}

}
