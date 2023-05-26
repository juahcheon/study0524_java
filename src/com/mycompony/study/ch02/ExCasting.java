package com.mycompony.study.ch02;

public class ExCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double doubleVar = 123456789;
		System.out.println("doubleVar: " + doubleVar);
		
		float floatVar = (float)  doubleVar;
		System.out.println("floatVar: " + floatVar);
		
		long longVar = (long) floatVar;
		System.out.println("longVar: " + longVar);
		
		int intVar = (int) floatVar;
		System.out.println("intVar: " + intVar);
		
		short shortVar = (short) floatVar;
		System.out.println("shortVar: " + shortVar);
		
		byte byteVar = (byte) floatVar;
		System.out.println("byteVar: " + byteVar);
		
		System.out.println("-------------------------------");
		
		String stringVar = String.valueOf(intVar);
		System.out.println("stringVar: " + stringVar);
		
		int intVar2 = Integer.parseInt(stringVar);
		System.out.println("intVar2: " + intVar2);
		
	}

}
