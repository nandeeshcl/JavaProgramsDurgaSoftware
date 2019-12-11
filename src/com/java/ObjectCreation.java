package com.java;


class Manager {
	int a=10;
	float f;
	char c;
	
	Manager()
	{
		c='X';
		int a=20;
	}
}
public class ObjectCreation {

	public static void main(String[] args) {

		Manager ob1=new Manager();
		
		Manager ob2=new Manager();
		
		//vale preference: Local->Constructor->Default value
		System.out.println(ob1.a);   //local instance var
		System.out.println(ob1.f);   //default value
		System.out.println(ob1.c);   //constructor value
		
		
		//Generate Hash code and Refrence value of objects
		System.out.println("Object ob1 hash code is "+ob1.hashCode());
		System.out.println("Object ob1 refrence value is "+ob1.toString());
		
		System.out.println("Object ob2 hash code is "+ob2.hashCode());   // 1311053135
		System.out.println("Object ob2 refrence value is "+ob2.toString()); // com.java.Manager@4e25154f
		
		
		//gives refrence value of object ob2
		System.out.println(ob2);   //com.java.Manager@4e25154f
		
		
		
	}

}
