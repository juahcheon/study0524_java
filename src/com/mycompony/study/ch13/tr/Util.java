package com.mycompony.study.ch13.tr;

public class Util {
	
	public static <T> Box<T> boxing(T t) {
		
		Box<T> box = new Box<>();
		return box;
		
	}
	
}
