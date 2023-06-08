package com.mycompony.study.ch06.first.tr01;

public class Iphone {

	String color;
	String model;
	int series;
	int size;
	String owner;
	
	Iphone() {
		
	}
	
	Iphone(String color) {
		this.color = color;
	}
	
	Iphone(String color, String model, int series, int size, String owner) {
		this.color = color;
		this.model = model;
		this.series = series;
		this.size = size;
		this.owner = owner;
	}
	
}
