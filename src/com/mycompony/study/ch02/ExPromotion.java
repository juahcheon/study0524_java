package com.mycompony.study.ch02;

public class ExPromotion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// byte < short < int < long < float < double
		
		byte byteVar = 10;
		System.out.println("byteVar:" + byteVar);
		
		short shortVar = byteVar;
		System.out.println("shortVar:" + shortVar);
		
		int intVar = byteVar;
		System.out.println("intVar:" + intVar);
		
		long longVar = 4654245466131L;
		System.out.println("longVar:" + longVar);
		
		long floatVar = 3;
		System.out.println("floatVar:" + floatVar);
		
		long doubleVar = 3;
		System.out.println("doubleVar:" + doubleVar);
		
		boolean a = true;
		if (a) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		
	}

}
