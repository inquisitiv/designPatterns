package com.java.application;

import com.java.classes.ElectronicDevice;
import com.java.classes.TVRemote;
import com.java.classes.Television;

public class Application {

	public static void main(String args[])
	{
		ElectronicDevice tv1 = new Television();
		TVRemote remote = new TVRemote(tv1);
		remote.pressOn();
		remote.pressOff();
		remote.pressVolUp();
		remote.pressVolUp();
		remote.pressVolUp();
		remote.pressVolUp();
		remote.pressVolDown();
		remote.pressVolDown();
		remote.pressVolDown();
		
	}
	
}
