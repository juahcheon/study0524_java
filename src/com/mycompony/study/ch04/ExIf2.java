package com.mycompony.study.ch04;

public class ExIf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int grade = 5;
		int prise = 12000;
		
		if (grade == 1) {
			System.out.println(prise * 0.95);
		} else if (grade == 2) {
			System.out.println(prise * 0.90);
		} else if (grade == 3) {
			System.out.println(prise * 0.85);
		} else if (grade == 4) {
			System.out.println(prise * 0.80);
		} else if (grade == 5) {
			System.out.println(prise * 0.973);
		}
	}

}
