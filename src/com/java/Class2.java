package com.java;

class Employee1 {
	String ename = "Appu";
	int eid = 100;
	float salary = 5000f;
	String email = "appu@gmail.com";

	public void getEmpDetails() {
		System.out.println("Employee details are");
		System.out.println("--------------------");
		System.out.println("Employee name is  " + ename);
		System.out.println("Employee ID is  " + eid);
		System.out.println("Employee salary is  " + salary);
		System.out.println("Employee email is " + email);
	}

	public void setEmpDetails(String ename, int eid, float salary, String email) {
		this.ename = ename;
		this.eid = eid;
		this.salary = salary;
		this.email = email;
	}
}

public class Class2 {

	public static void main(String[] args) {
		
		Employee1 e1=new Employee1();
		e1.setEmpDetails("APPU",200,500.55f,"appu@gmail.com");
		e1.getEmpDetails();
		
		Employee1 e2=new Employee1();
		e1.setEmpDetails("SHIVU",201,200.55f,"sivu@gmail.com");
		e1.getEmpDetails();
		
		Employee1 e3=new Employee1();
		e1.setEmpDetails("RAGHU",202,400.55f,"raghu@gmail.com");
		e1.getEmpDetails();
		

	}

}
