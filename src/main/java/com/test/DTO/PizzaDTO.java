package com.test.DTO;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.test.models.Ingridient;
import com.test.models.Pizza;

public class PizzaDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8696832935159753231L;
	private String name;
	private List<Ingridient> ingridients;
	
	
	
	public PizzaDTO(List<Ingridient> ingridients, String name) {
		super();
		this.ingridients = ingridients;
		this.name = name;
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

	public void setName(String name) {
		this.name = name;
	}
	
	public static List<PizzaDTO> ConvertCollectionToDTOList(Collection<Pizza> pizzas){
		List<PizzaDTO> pizzasDto = new ArrayList<PizzaDTO>();
		pizzas.forEach(x -> pizzasDto.add(
				new PizzaDTO(x.getIngridients(),x.getName())
		));
		return pizzasDto;
	}
		
}
