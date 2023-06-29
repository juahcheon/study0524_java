package com.mycompony.study.ch08.first;

public class ExRemoteControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Television television = new Television();		
		television.turnOn();
		
		RemoteControl remoteControl = new SettopBox();
		remoteControl.setMute(true);
		remoteControl.setMute(false);
		
		television.setVolume(-10);
		
		remoteControl.turnOn();
		
		RemoteControl.changeBattery();
		
		television.turnOff();
		
		
		
		
	}

}
