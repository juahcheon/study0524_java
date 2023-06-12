package com.mycompony.study.ch06.ninth;

import java.util.Scanner;

public class TrExGugu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("정수를 입력해주세요.");
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		System.out.println(a);

		// int result1 = TrGugu.areaSquare(1);
		// int result2 = TrGugu.areaSquare(1, 2);
		// System.out.println(result2);
		
		
			
			for(int b = 1; b < 10; b++) {
				int result = TrGugu.areaSquare(a, b);
				System.out.println(a + "x" + b + "=" + result);
			}
		
		
	}

}
