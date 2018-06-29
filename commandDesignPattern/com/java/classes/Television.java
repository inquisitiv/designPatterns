package com.java.classes;

public class Television implements ElectronicDevice {

	private int volume = 0;
	private int channel = 0;

	@Override
	public void on() {
		System.out.println("TV is on");
	}

	@Override
	public void off() {
		System.out.println("TV is off");

	}

	@Override
	public void volUp() {
		volume++;
		System.out.println("TV vol at " + volume);

	}

	@Override
	public void volDown() {
		volume--;
		System.out.println("TV vol at " + volume);

	}

	@Override
	public void chUp() {
		if (channel < 50) {
			channel++;
		} else
			channel = 0;
		System.out.println("TV channel at " + channel);

	}

	@Override
	public void chDown() {
		if (channel > 0) {
			channel--;
		} else
			channel = 50;
		System.out.println("TV channel at " + channel);

	}

}
