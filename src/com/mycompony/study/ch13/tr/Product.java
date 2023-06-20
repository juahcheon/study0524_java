package com.mycompony.study.ch13.tr;

public class Product<A, B> {

	private A argument;
	private B basement;
	
	public A getArgument() {
		return argument;
	}
	public void setArgument(A argument) {
		this.argument = argument;
	}
	
	public B getBasement() {
		return basement;
	}
	public void setBasement(B basement) {
		this.basement = basement;
	}
	
}
