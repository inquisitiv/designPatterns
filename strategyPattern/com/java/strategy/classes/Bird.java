package com.java.strategy.classes;

public class Bird extends Animal {

	public Bird()
	{
		super();
		flyingType = new CanFly();
	}
}

