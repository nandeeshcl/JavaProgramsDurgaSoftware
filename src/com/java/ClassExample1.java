package com.java;

class Employee
{
	String ename="Appu";
	int eid=100;
	float salary=5000f;
	String email="appu@gmail.com";
	
	public void empDetails()
	{
		System.out.println("Employee details are");
		System.out.println("--------------------");
		System.out.println("Employee name is  "+ename);
		System.out.println("Employee ID is  "+eid);
		System.out.println("Employee salary is  "+salary);
		System.out.println("Employee email is "+email);
	}
}

public class ClassExample1 {

	public static void main(String[] args) {
		
		Employee e1=new Employee();
		e1.empDetails();
		
		System.out.println("------------------");
		
		Employee e2=new Employee();
		e2.empDetails();
		

	}

}
