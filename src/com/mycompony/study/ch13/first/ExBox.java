package com.mycompony.study.ch13.first;

public class ExBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Box<String> box = new Box<>();
		box.setT("최승철");
		System.out.println("이름은 " + box.getT() + "이고");
		
		Box<Integer> box2 = new Box<>();
		box2.setT(30);
		System.out.println("나이는 " + box2.getT() + "살 입니다.");
		
		Box<Object> box3 = new Box<>();
		box3.setT(box2.getT());
		System.out.println(box3.getT() + "살이라고요? 젊어보이시네요0000000");
		
	}

}
