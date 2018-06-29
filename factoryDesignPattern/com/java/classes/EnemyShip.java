package com.java.classes;

public abstract class EnemyShip {

	public String name;
	private double amtDamage;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAmtDamage() {
		return amtDamage;
	}
	public void setAmtDamage(double amtDamage) {
		this.amtDamage = amtDamage;
	}
	
	public void followHeroShip() {
		System.out.println(getName() + " following the Hero");
	}
	
	public void displayEnemyShip() {
		System.out.println(getName() + " is On Screen");
	}
	
	public void enemyShipShoots() {
		System.out.println(getName() + " attacks and does damage " + getAmtDamage());
	}
	
}
