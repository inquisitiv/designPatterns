package com.java.classes;

public class PlainPizza implements Pizza {

	@Override
	public String getDescription() {
		return "thin dough";
	}

	@Override
	public int getCost() {
		return 4;
	}

}
