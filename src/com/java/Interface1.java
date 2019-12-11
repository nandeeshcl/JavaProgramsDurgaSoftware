package com.java;

interface I {
	int a = 10;

	void m1();

	void m2();

}

class ImplementationClass implements I {

	public void m1() {
		
		System.out.println("M1 method");
		System.out.println(a);

	}

    public  void m2() {
		// TODO Auto-generated method stub
		System.out.println("M2 method");
	}
	
	public void m3() {
		// TODO Auto-generated method stub
		System.out.println("M3 method");
	}
	

}

public class Interface1 {

	public static void main(String[] args) {
	
		ImplementationClass i1=new ImplementationClass();
		I i=new ImplementationClass();
		
		//class ref var can acess both parent and child methods
		i1.m1();
		i1.m2();
		i1.m3();
		
		//interface ref var , can able to access only parent methods
		i.m1();
		i.m2();
		
		System.out.println(i1.a);  //class ref  var
		System.out.println(ImplementationClass.a);   //by class name
		
		System.out.println(I.a);   //interface name
		System.out.println(i.a);   //interface ref var
		
		

	}

}
