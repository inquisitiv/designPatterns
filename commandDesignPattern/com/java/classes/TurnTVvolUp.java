package com.java.classes;

public class TurnTVvolUp implements Command {

	private ElectronicDevice device;
	
	public TurnTVvolUp(ElectronicDevice device)
	{
		this.device = device;
	}
	
	@Override
	public void execute() {
		device.volUp();		
	}

}
