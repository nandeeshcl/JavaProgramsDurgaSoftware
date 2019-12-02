package com.java;


class sample4
{
	int a;     //global var
	void test()
	{
		int b;   //local var
		System.out.println(a);
		//System.out.println(b);  ///error :because local variable should be initilized before use
		
	}
}

public class LocalandGlobalVariableInitilization {

	public static void main(String[] args) {
		
		sample4 s4=new sample4();
		s4.test();

	}

}
