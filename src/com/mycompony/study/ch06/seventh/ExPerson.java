package com.mycompony.study.ch06.seventh;

public class ExPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person person = new Person(null, "1234", "천주아");
		
		// person.nation = "미국";	// final은 중간에 값 대입 불가능
		// person.ssn = "묻지마";		// final은 중간에 값 대입 불가능
		person.name = "천주아";
		
	}

}
