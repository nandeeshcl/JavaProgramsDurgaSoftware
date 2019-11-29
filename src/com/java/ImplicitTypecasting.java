package com.java;

class sample1 {
	public void test() {
		
		// Implicit conversion
		byte b = 2;
		int a = b;   //Lower to Higher

		/*
		 * higher data type to lower datatype int a=10; byte b=a;  Error
		 */
		System.out.println(a);
		System.out.println(b);
	}
}

public class ImplicitTypecasting {

	public static void main(String[] args) {

		sample1 s1 = new sample1();
		s1.test();

	}

}
