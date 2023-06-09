package com.mycompony.study.ch06.third;

public class ExArithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 5;
		int b = 10;
		
		Arithmetic arithmetic = new Arithmetic();
		int result = arithmetic.multi(5, 3);
		System.out.println(result);
	
		String result2 = arithmetic.changeName("장원영");
		System.out.println(result2);
		
		arithmetic.ive("아이브");
		int result3 = arithmetic.taken();
		System.out.println(result3 + "원을 주웠습니다.");
	}

}
