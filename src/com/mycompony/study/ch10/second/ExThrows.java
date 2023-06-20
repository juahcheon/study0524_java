package com.mycompony.study.ch10.second;

public class ExThrows {

	public static void main(String[] args) throws ClassNotFoundException {
		
		finalClass();
		
	}
	
	public static void finalClass() throws ClassNotFoundException {
		
		Class clazz = Class.forName("java.lang.String2");
		
	}
	
}
