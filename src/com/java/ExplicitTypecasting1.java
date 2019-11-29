package com.java;

class sample2 {
	public void test() {

		// Explicit conversion
		int a = 10;
		byte b = (byte) a; // explicit type casting
		                   //converting higher data type int to b yte explicityly by using cast operator

		System.out.println(a);
		System.out.println(b);
	}
}

public class ExplicitTypecasting1 {

	public static void main(String[] args) {

		sample2 s2 = new sample2();
		s2.test();
	}

}
