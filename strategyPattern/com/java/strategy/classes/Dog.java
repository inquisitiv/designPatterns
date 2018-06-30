package com.java.strategy.classes;

public class Dog extends Animal {

	public Dog()
	{
		super();
		flyingType = new CantFly();
	}
}
