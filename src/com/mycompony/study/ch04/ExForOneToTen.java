package com.mycompony.study.ch04;

public class ExForOneToTen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;
		int sum = 0;
		
		for (i=1; i<=10; i++) {
			
			sum = sum + i;
			
			System.out.println("i : " + i + "|" + "sum : " + sum);
		}
		
		int a;
		int plus = 0;
		
		
		for (a = 11; a <= 50; a++) {
			if (a % 2 == 0) {
				plus += a;
				System.out.println(a + "|" + plus);
			}
		}
		
	}

}
