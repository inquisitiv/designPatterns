package com.java.classes;

public class TVRemote {
	
	protected ElectronicDevice device;
	protected TurnTVOn tvOn;
	protected TurnTVOff tvOff;
	protected TurnTVvolUp volUp;
	protected TurnTVvolDown volDown;
	
	public TVRemote(ElectronicDevice device) {
		
		this.device = device;
		tvOff = new TurnTVOff(device);
		tvOn = new TurnTVOn(device);
		volUp = new TurnTVvolUp(device);
		volDown = new TurnTVvolDown(device);
	}
	
	public void pressOn(){
		tvOn.execute();
	}
	
	public void pressOff(){
		tvOff.execute();
	}
	
	public void pressVolUp(){
		volUp.execute();
	}
	
	public void pressVolDown(){
		volDown.execute();
	}
	
}
