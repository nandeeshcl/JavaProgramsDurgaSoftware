package com.java;

class Sampel22 {
	public void method(int... a) {
		System.out.println("Length is " + a.length);
		System.out.println("First element is "+a[0]);
		System.out.println("----------------");
		
		//print all values
		for(int i=0;i<a.length;i++)
		{
			System.out.print("The elements are "+a[i]);
			//System.out.println("----------------");
		}
		
	}
}

public class VarArgMethod {

	public static void main(String[] args) {
		Sampel22 s2 = new Sampel22();
		s2.method(11);
		s2.method(121);
		s2.method(22, 33);

	}

}
