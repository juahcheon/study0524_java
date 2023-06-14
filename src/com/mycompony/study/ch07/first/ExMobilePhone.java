package com.mycompony.study.ch07.first;

public class ExMobilePhone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CellPhone cellPhone = new CellPhone();
		
		cellPhone.powerOn();
		cellPhone.powerOn(1);
		
		System.out.println("==================");
		
		MobilePhone mobilePhone = new MobilePhone();
		
		mobilePhone.changeChannelDmb(1);
		mobilePhone.powerOn();
		mobilePhone.powerOn(1);
		mobilePhone.aaa();
		
	}

}
