package com.java.application;

import com.java.abtract.factory.classes.EnemyShip;
import com.java.abtract.factory.classes.EnemyShipBuilding;
import com.java.abtract.factory.classes.UFOEnemyShipBuilding;

public class EnemyShipTesting {
	
	public static void main(String[] args) {
		
		EnemyShipBuilding makeUFOs = new UFOEnemyShipBuilding();
		EnemyShip theGrunt = makeUFOs.orderTheShip("UFO");
		System.out.println(theGrunt);
		
		EnemyShip theBoss = makeUFOs.orderTheShip("UFO Boss");
		System.out.println(theBoss);
	}

}
