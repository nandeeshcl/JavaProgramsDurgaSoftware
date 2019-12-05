package com.java;

class sampless
{
	int a=10; //class level variable
	float b=20.5f;  //class level variable
	
	public void testVariableScope()
	{
		int a=20;
		float b=3.3f;
	
		System.out.println(a);  //local variable
		System.out.println(b);   //loacal variable
		
		System.out.println(this.a); //class level variable values
		System.out.println(this.b); //class level variable values
		
		
	}
}


public class VariableScope {


	public static void main(String[] args) {

		sampless s=new sampless();
		s.testVariableScope();

	}
	
}
