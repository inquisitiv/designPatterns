package com.java.strategy.application;

import com.java.strategy.classes.Animal;
import com.java.strategy.classes.Bird;
import com.java.strategy.classes.CanFly;
import com.java.strategy.classes.Dog;

public class AnimalPlay {

	public static void main(String[] args) {
		
		Animal sparky = new Dog();
		Animal birdie = new Bird();
		
		System.out.println("Dog : " + sparky.getFlyingType());
		System.out.println("Birdie : " + birdie.getFlyingType());
		
		sparky.setFlyingType(new CanFly());
		
		System.out.println("Dog : " + sparky.getFlyingType());
		
	}
	
}
