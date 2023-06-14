package com.mycompony.study.ch07.first;

public class MobilePhone extends DmbCellPhone {

	void aaa() {
		System.out.println("aaa");
		powerOn();
		changeChannelDmb(1);
	}
	
	@Override
	void changeChannelDmb(int channel) {
		System.out.println("MobilePhone.DmbCellPhone");
	}
	
	@Override
	void powerOn(int a) {
		// TODO Auto-generated method stub
		System.out.println(a + "번 채널을 엽니다.");
	}
	

}
