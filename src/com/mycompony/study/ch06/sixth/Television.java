package com.mycompony.study.ch06.sixth;

public class Television {

	public static String company = "LG";
	public static String model = "OLED";
	public static String companyModel = company + ":" + model;
	public static String info;
	
	// 여러 개의 class를 동시에 작동시킬 때 사용.
	static {
		info = company + ":" + model;
		abc(); // static 으로 선언된 class만 삽입 가능.
	}
	
	public static void abc() {
		System.out.println("abc()");
	}
}
