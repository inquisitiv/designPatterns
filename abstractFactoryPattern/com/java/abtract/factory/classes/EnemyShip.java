package com.java.abtract.factory.classes;

public abstract class EnemyShip {

	private String name;
	ESWeapon weapon;
	ESEngine engine;

	public String getName()

	{
		return name;
	}

	public void setName(String name)

	{
		this.name = name;
	}

	abstract void makeShip();

	public void followHeroShip() {
		System.out.println(getName() + " is following the hero at speed " + engine);
	}

	public void displayEnemyShip() {
		System.out.println(getName() + " is on screen");

	}

	public void enemyShipShoots() {
		System.out.println(getName() + " attacks and does damage " + weapon);

	}

	public String toString() {
		String infoShip = "The " + getName() + " has a top speed of " + engine + " and an attack power of " + weapon;
		return infoShip;
	}
}
