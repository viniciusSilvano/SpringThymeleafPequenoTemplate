package com.test.models;

public class ChessePizza implements Pizza {
	
    @Override
    public void addIngredients() {
        System.out.println("Preparing ingredients for cheese pizza.");
    }
}
