package com.java.abtract.factory.classes;
//With Abstract Factory in particular, the decision about which 
//factory to use is made at runtime. Typically, this is done in 
//some code dedicated to providing the right factory by conditional
//branching based on some key piece of information. This means as 
//more factories are created, this central decision point must be modified. That's annoying.

public class UFOEnemyShipBuilding extends EnemyShipBuilding {

	@Override
	protected EnemyShip makeEnemyShip(String typeOfShip) {
		
		EnemyShip theEnemyShip = null;
		
		if(typeOfShip == "UFO")
		{
			EnemyShipFactory shipPartsFactory = new UFOEnemyShipFactory();
			theEnemyShip = new UFOEnemyShip(shipPartsFactory);
			theEnemyShip.setName("UFO Grunt Ship");
			
		} else if(typeOfShip == "UFO Boss")
		{
			EnemyShipFactory shipPartsFactory = new UFOBossEnemyShipFactory();
			theEnemyShip = new UFOBossEnemyShip(shipPartsFactory);
			theEnemyShip.setName("UFO Boss Ship");
		}
		
		return theEnemyShip;
		
	}

}
