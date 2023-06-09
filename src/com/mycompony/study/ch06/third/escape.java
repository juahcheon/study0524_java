package com.mycompony.study.ch06.third;

public class escape {

	public int add(int a, int b) {
		int y = a + b;
		return y;
	} 
	
	public String myMember (String memberName) {
		String result;
		if (memberName.equals("최승철")) {
			System.out.println("제 최애가 맞아요.");
		} else {
			System.out.println("제 최애가 아니에요.");
		}
		return "";
	}
	
	public void theme (String name) {
		if (name.equals("백신")) {
			System.out.println("내일 제가 할 테마입니다.");
		} else {
			System.out.println("다음 기회에..");
		}
	}
	
}
