package com.mycompony.study.ch13.tr;

public class ExBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Box<String> box = new Box<>();
		box.setT("최승철");
		System.out.println(box.getT());
		
		Box<Integer> box2 = new Box<>();
		box2.setT(95);
		System.out.println(box2.getT());
		
		Box<Object> box3 = new Box<>();
		box3.setT(box2.getT());
		System.out.println(box3.getT());
		
	}

}
