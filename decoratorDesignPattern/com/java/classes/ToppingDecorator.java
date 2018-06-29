package com.java.classes;

public abstract class ToppingDecorator implements Pizza {

	protected Pizza tempPizza;
	
	public ToppingDecorator(Pizza newPizza)
	{
		tempPizza = newPizza;
	}
	
	@Override
	public String getDescription() {
		return tempPizza.getDescription();
	}

	@Override
	public int getCost() {
		return tempPizza.getCost();
	}
}
