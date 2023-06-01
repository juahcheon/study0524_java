package com.mycompony.study.ch04;

public class ExIf5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 0;
		int c = -1;
		
		if (a > b && a > c ) {
			System.out.println("최대값은 " + a + "입니다.");
			if ( b > c ) {
				System.out.println("최소값은 " + c + "입니다.");
			} else {
				System.out.println("최소값은 " + b + "입니다.");
			}
			
		} else if (b > a && b > c) {
			System.out.println("최대값은 " + b + "입니다.");
			if ( a > c ) {
				System.out.println("최소값은 " + c + "입니다.");
			} else {
				System.out.println("최소값은 " + a + "입니다.");
			}
			
		} else if (c > b && c > a) {
			System.out.println("최대값은 " + c + "입니다.");
			if ( a > b ) {
				System.out.println("최소값은 " + b + "입니다.");
			} else {
				System.out.println("최소값은 " + a + "입니다.");
			}
		} else {
			System.out.println("모두 같다.");
		}
		
	}

}
