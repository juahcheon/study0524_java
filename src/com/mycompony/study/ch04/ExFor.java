package com.mycompony.study.ch04;

public class ExFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a;
		int b;
		int flex;
		
		for(a = 2; a <= 9; a++) {
			for(b = 0; b <= 9; b++) {
				flex = a * b;
				System.out.println(a + "x" + b + "=" + flex);
			}
			System.out.println("--------------------");
		}
	}

}
