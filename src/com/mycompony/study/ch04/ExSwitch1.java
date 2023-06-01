package com.mycompony.study.ch04;

public class ExSwitch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 3;
		
		switch(num) {
		
			case 1:
				System.out.println("1번이 나왔습니다.");
				break;
			case 2:
				System.out.println("2번이 나왔습니다.");
				break;
			case 3:
				System.out.println("3번이 나왔습니다.");
				break;
		}
		
		String a = "천주아";
		
		switch(a) {
			
			case "사장":
				System.out.println(a + "의 연봉은 10억입니다.");
				break;
			case "부장":
				System.out.println(a + "의 연봉은 5억입니다.");
				break;
			case "과장":
				System.out.println(a + "의 연봉은 2억입니다.");
				break;
			case "대리":
				System.out.println(a + "의 연봉은 1억입니다.");
				break;
			case "주임":
				System.out.println(a + "의 연봉은 8천입니다.");
				break;
			case "사원":
				System.out.println(a + "의 연봉은 5천입니다.");
				break;
			case "천주아":
				System.out.println(a + "의 연봉은 100억입니다.");
				break;
			default:
				System.out.println("없는 position입니다. 다시 입력해주세요.");
				break;
		
		}
	}

}
