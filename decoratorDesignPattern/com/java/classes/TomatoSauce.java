package com.java.classes;

public class TomatoSauce extends ToppingDecorator {

	public TomatoSauce(Pizza newPizza) {
		super(newPizza);
		
		System.out.println("Adding Sauce");
	}
	
	@Override
	public String getDescription() {
		return tempPizza.getDescription() + ", Sauce";
	}

	@Override
	public int getCost() {
		return tempPizza.getCost() + 1;
	}

}
