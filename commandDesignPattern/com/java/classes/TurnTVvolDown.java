package com.java.classes;

public class TurnTVvolDown implements Command {

	private ElectronicDevice device;
	
	public TurnTVvolDown(ElectronicDevice device)
	{
		this.device = device;
	}
	
	@Override
	public void execute() {
		device.volDown();		
	}

}
