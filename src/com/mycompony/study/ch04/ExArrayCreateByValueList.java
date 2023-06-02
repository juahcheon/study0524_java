package com.mycompony.study.ch04;

public class ExArrayCreateByValueList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[][][] scoreEnglish;
//		int scoreMath[][][];
//		// 배열 안에 배열 안에 배열 안에 배열 안에 배열... 이 가능.
//		
//		String[] name;
//		String name2[];
//		
//		double[] total;
//		double avg[];
//		
//		char[] grade232301;
//		char grade232302[];
//		
//		boolean[] score;
//		boolean score2[];
		
		int[] scoreChemistry = {100,99,98,97,96,95};
		String[] scoreStudents = {"Anna", "Ben", "Chrlie", "Deny", "Emily", "Frank"};
		// String은 "" 필수.
		char[] score = {'A', 'B', 'C', 'D', 'E', 'F'};
		
		// 값 추가는 안됨.
		// scoreChemistry[7] = 93; 	// 컴파일 에러
		
		
		// 값 바꾸기는 가능
		scoreChemistry[0] = 0;
		
//		int[] scorePhysics;
//		scorePhysics = {100,99,98,97,96};	// error
		// 선언과 동시에 초기화를 해야함.
		
		int a = scoreChemistry.length;
		// System.out.println(a);
		
		// System.out.println(scoreChemistry[0]);
		
		for (int i = 0; i < scoreChemistry.length; i++) {
			//System.out.println(scoreChemistry[i]);
		}
		
		int j = 0;
		while (j < scoreChemistry.length) {
			//System.out.println(scoreChemistry[j]);
			j++;
		}
		
		// 향상된 for문.
		// 자동으로 값을 배열해줌. 단점, 인덱스를 못 쓴다.
		for(int bb: scoreChemistry) {
			//System.out.println(bb);
		}
		
		int sum = 0;
		for(int i = 0; i < scoreChemistry.length; i++) {
			System.out.println(scoreChemistry[i]);
			sum = sum + scoreChemistry[i];
		}
		System.out.println(sum);
		
		int sum2 = 0;
		int i = 0;
		while(i < scoreChemistry.length) {
			// System.out.println(scoreChemistry[i]);
			sum2 = sum2 + scoreChemistry[i];
			i++;
		}
		System.out.println(sum2);
		
		int sum3 = 0;
		for(int bb: scoreChemistry) {
			// System.out.println(bb);
			sum3 = sum3 + bb;
		}
		System.out.println(sum3);
	}

}
