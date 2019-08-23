package com.test.util;

public enum PizzasEnum {
	CHESSE("chesse pizza"),PEPPERONI("pepperoni pizza"),VEGGIE("veggie pizza");
	
	private String name;
	PizzasEnum(String name){
		this.name = name;
	}
	
	public String getPizzaName() {
		return this.name;
	}
	
}
