package com.mycompony.study.ch15.first;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ExLanguage {

	public static void main(String[] args) {
		
		ArrayList<Language> arrayList = new ArrayList<Language>();
		
		
		
		Language language = new Language("Python", 12);
		
		arrayList.add(language); 
		// 데이터를 넣는 방법2.
		arrayList.add(new Language("C#", 8)); 
		arrayList.add(new Language("Node", 6)); 
		
		for(Language a: arrayList) {
			System.out.print(a.name);
			System.out.println(a.version);
		}
		
		
		
		// TODO Auto-generated method stub

//		List<String> list = new LinkedList<String>();	// 인터페이스를 왼쪽에
//		
//		list.add("JAVA");
//		list.add("python");
//		list.add("Node");
//		// add = ArrayList라는 클래스에 포함.
//		list.add(2, "C#");
		
//		int i = 0;
//		for(String a: list) {
//			System.out.println(i + ":" + a);
//			i++;
//		}
//		
//		System.out.println("===============");
//		
//		list.remove(2);
//		list.remove("JAVA");
//		
//		int j = 0;
//		for(String a: list) {
//			System.out.println(j + ":" + a);
//			j++;
//		}
		
		
//		for(int i=0; i<list.size(); i++) {
//			System.out.println("list.get("+i+")" + list.get(i));
//		}
//		
//		System.out.println("================");
//		
//		// 향상된 for문
//		for(String a: list) {
//			// String a: list[i];
//			System.out.println(a);
//		}
		
//		ArrayList<String> arrayList = new ArrayList<String>();	// 클래스를 왼쪽에
//		
//		arrayList.add("1");
//		arrayList.add("2");
//		arrayList.add("3");
//		// add = ArrayList라는 클래스에 포함.
//		arrayList.add(2, "4#");
		
//		for(int i=0; i<arrayList.size(); i++) {
//			System.out.println("list.get("+i+")" + list.get(i));
//		}
//		
//		System.out.println("================");
//		
//		// 향상된 for문
//		for(String a: arrayList) {
//			// String a: list[i];
//			System.out.println(a);
//		}
		// 둘 다 가능.
	}

}
