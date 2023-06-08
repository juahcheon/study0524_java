package com.mycompony.study.ch04;

public class ExEnumWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 1;
		Week week;
		String aaa;
		
		// aaa = Week.MONDAY; 	 error : type mismatch
		aaa = Week.MONDAY.toString();
		System.out.println(aaa);
	}

}
