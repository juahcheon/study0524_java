package com.mycompony.study.ch04;

public class ExArrayInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// kor, eng, math
		String[] name = {"최승철", "윤정한", "조슈아", "이찬", "준"};
		
		int[][] score = {{99,88,55}, {55,77,99}, {55,11,44}, {11,22,33}};
		for (int i = 0; i < score.length; i++) {
			// System.out.println(i);
			for (int j = 0; j < score[i].length; j++) {
				//System.out.println(score[i][j]);
			}
			//System.out.println("---------------");
		}
		
		int sumK = 0;
		int sumE = 0;
		int sumM = 0;
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				sumK += score[i][0];
				sumE += score[i][1];
				sumM += score[i][2];
			} 
		} System.out.println("과목별 총합: " + "K: " + sumK);
		System.out.println("과목별 총합: " + "E: " + sumE);
		System.out.println("과목별 총합: " + "M: " + sumM);
		
		int SCoups = 0;
		int JH = 0;
		int JOSUAH = 0;
		int DINO = 0;
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				if ( i == 0 ) {
					SCoups += score[0][j];
				} else if ( i == 1 ) {
					JH += score[1][j];
				} else if ( i == 2 ) {
					JOSUAH += score[2][j];
				} else {
					DINO +=  score[3][j];
				}
				
			} 
		} System.out.println("학생별 총합 | " + name[0] + ": " + SCoups/3);
		System.out.println("학생별 총합 | " + name[1] + ": " + JH/3);
		System.out.println("학생별 총합 | " + name[2] + ": " + JOSUAH/3);
		System.out.println("학생별 총합 | " + name[3] + ": " + DINO/3);
		
		
	}
}
