package com.mycompony.study.ch06.second;

public class ExCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car = new Car();
		Car car2 = new Car("블랙");
		Car car3 = new Car(6, "M031i", "딥블루","BMW");
		
		System.out.println("car3.name: " + car3.name);
		System.out.println("car3.engine: " + car3.engine);
		System.out.println("car3.color: " + car3.color);
		System.out.println("car3.company: " + car3.company);
		
	}

}
