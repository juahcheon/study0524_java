package com.mycompony.study.ch03;

public class ExIncreaseDecreaseOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 증감 연산자(++, --)
		
		int i = 0;
		int j = 0;
		
		++i;
		j++;
		
		System.out.println("i: " + i);
		System.out.println("j: " + j);
		
		int a = 1;
		int b = 1;
		
		--a;
		b--;
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		int k = i++;
		int m = ++j;
		
		System.out.println("k: " + k);	// 대입연산자 우선
		System.out.println("i: " + i);	// 대입 연산이 끝난 후 ++
		System.out.println("m: " + m);	// ++ 우선
		System.out.println("j: " + j);	// ++ 이후 대입연산자
		
		--i;
		
		int z = ++i + j++;
		System.out.println("z: " + z);	// ++ 이후 대입연산자
		System.out.println("i: " + i);	// ++ 이후 대입연산자
		System.out.println("j: " + j);	// ++ 이후 대입연산자
		
	}

}
