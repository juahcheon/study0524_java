package com.mycompony.study.ch13.tr;

public class ExProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product<String, Integer> product = new Product<>();
		
		product.setArgument("최승철");
		product.setBasement(95);
		
		System.out.println(product.getArgument());
		System.out.println(product.getBasement());
		
		Product<Tv, String> product2 = new Product<>();
		
		Tv tv = new Tv();
		
		product2.setArgument(tv);
		product2.setBasement("최승철");
		
		System.out.println(product2.getArgument());
		System.out.println(product2.getBasement());
	}

}
