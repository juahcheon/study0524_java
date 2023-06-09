package com.mycompony.study.ch06.third;

import java.lang.invoke.SwitchPoint;

public class Arithmetic {

	// 더하기 함수 (피연산자는 2개로 한정)
	public int minus(int c, int d) {
		int y = c + d;
		return y;
	}
	
	public int add(int a, int b) {
		int y = a + b;
		return y;
	}
	
	public int multi(int a, int b) {
		int y = a * b;
		return y;
	}
	
	public String changeName (String name) {
		String result;
		
		if(name.equals("장원영")) {
			result = "Tony";
		} else {
			result = "I don't know";
		}
		return result;
	}
	
	public void ive(String name) {
		switch (name) {
		case "아이브":
			System.out.println("장원영은 너무 예뻐");
			break;
		default:
			System.out.println("다른 사람은 그냥 예뻐");
			break;
		}
	}
	
	
	public int taken() {
		return 10000;
	}
	
	
}
