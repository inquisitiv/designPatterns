package com.java.application;

import java.util.Scanner;

import com.java.classes.EnemyShip;
import com.java.classes.EnemyShipFactory;

public class Application {

	public static void main(String[] args) {
		
		EnemyShipFactory shipFactory = new EnemyShipFactory();
		EnemyShip theEnemy = null;
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("What type of enemy U/R/B ?");
		String type = null;
		if(userInput.hasNextLine())
		type = userInput.nextLine();
		theEnemy = shipFactory.makeEnemyShip(type);
		
		if(theEnemy != null)
		{
			theEnemy.displayEnemyShip();
			theEnemy.followHeroShip();
			theEnemy.enemyShipShoots();
		} else System.out.println("Enter U/R/B next time");
	}
	
}
