package com.test.DTO;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.test.models.Ingridient;
import com.test.models.Pizza;

public class PizzaDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8696832935159753231L;
	private List<Ingridient> ingridients;
	
	
	
	public PizzaDTO(List<Ingridient> ingridients) {
		super();
		this.ingridients = ingridients;
	}

	public static List<PizzaDTO> ConvertListToDTOList(List<Pizza> pizzas){
		List<PizzaDTO> pizzasDto = new ArrayList<PizzaDTO>();
		pizzas.forEach(x -> pizzasDto.add(
				new PizzaDTO(x.getIngridients())
		));
		return pizzasDto;
	}

	public List<Ingridient> getIngridients() {
		return ingridients;
	}

	public void setIngridients(List<Ingridient> ingridients) {
		this.ingridients = ingridients;
	}
	
	
}
