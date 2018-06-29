package com.java.application;

import com.java.classes.Mozzarella;
import com.java.classes.Pizza;
import com.java.classes.PlainPizza;
import com.java.classes.TomatoSauce;

public class PizzaMaker {

	public static void main(String[] args) {
		
		Pizza basicPizza = new TomatoSauce(new Mozzarella(new PlainPizza()));
		
		System.out.println("Ingredients : " + basicPizza.getDescription());
		
		System.out.println("Cost : " + basicPizza.getCost());
		
	}
	
	
}
