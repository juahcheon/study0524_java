package com.mycompony.study.ch07.exam;

public class ComputerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator calculator = new Calculator();
		Computer computer = new Computer();
		
		int r = 7;
		System.out.println("원의 반지름: " + r);
		System.out.println();
		System.out.println("Calculator 객체의 원면적 구하는 프로그램 실행");
		System.out.println("원면적: " + calculator.param(7.0));
		System.out.println();
		System.out.println("Computer 객체의 원면적 구하는 프로그램 실행");
		System.out.println("원면적: " + computer.param(7.0));
	}

}
