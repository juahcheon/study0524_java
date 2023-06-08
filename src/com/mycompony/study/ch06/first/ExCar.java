package com.mycompony.study.ch06.first;

public class ExCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 1;
		System.out.println(a);
		
		Car car = new Car();	// 생성
		System.out.println("car.name : " + car.name);
		System.out.println("car.color : " + car.color);
		System.out.println("car.company : " + car.company);
		System.out.println("car.engine : " + car.engine);
		
		car.go();
		car.back();
		
		MP3 MP3 = new MP3();
	}

}
