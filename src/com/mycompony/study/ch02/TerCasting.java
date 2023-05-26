package com.mycompony.study.ch02;

public class TerCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intVar = (int) 123456789;
		System.out.println(intVar);
		
		String stringVar = String.valueOf(intVar);
		System.out.println(stringVar);
		
		int intVar2 = Integer.parseInt(stringVar);
		System.out.println(intVar2);
		
	}

}
