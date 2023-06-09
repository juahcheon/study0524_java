package com.mycompony.study.ch06.third;

public class ExEscape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		escape escape = new escape();
		int result = escape.add(5, 6);
		System.out.println(result);
		
		String result2 = escape.myMember("윤정한");
		System.out.println(result2);
		
		escape.theme("키이스케이프");
	}

}
