package com.java.strategy.classes;

public class Animal {

	public Flys flyingType;

	public String getFlyingType() {
		return flyingType.fly();
	}

	public void setFlyingType(Flys flyingType) {
		this.flyingType = flyingType;
	}

}
