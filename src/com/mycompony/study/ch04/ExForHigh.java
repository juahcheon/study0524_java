package com.mycompony.study.ch04;

public class ExForHigh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "*";
		int i;
		int j;
		
		// for (i = 1; i <= 5; i++) {
		//	for (j = 1; j <= 10; j++) {
		//		System.out.print("*");
		//	}
		//	System.out.println();
		// }
		
		for (i = 1; i <= 5; i++) {
			if (i == 1 || i == 5) {
				for (j = 1; j <= 10; j++) {
					System.out.print("*");
				}
				
			} else {
				for (j = 1; j <= 10; j++) {
					if (j == 1 || j == 10) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
					
				}
			
			}
		
			System.out.println();
		}
		
		
		
	}

}
