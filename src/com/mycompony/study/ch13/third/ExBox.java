package com.mycompony.study.ch13.third;

public class ExBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 보편적인 방법
		Box<String> box = new Box<>();
		
		// 제네릭 메서드 사용법
		Box<Integer> box2 = Util.boxing(13);
				
	}

}
