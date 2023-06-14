package com.mycompony.study.ch08.first;

public class ExTelevision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RemoteControl.changeBattery();
		
		RemoteControl remoteControl = new SettopBox();
		remoteControl.turnOn();
		remoteControl.setMute(true);
		
	}

}
