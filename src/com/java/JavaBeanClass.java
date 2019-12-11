package com.java;

class Employeee {
	
	private int eid;
	private String ename;

	// Gettter method
	public int getEid() {
		return eid;
	}

	// Setter method
	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

}

public class JavaBeanClass {

	public static void main(String[] args) {

		Employeee e1 = new Employeee();
		// System.out.println(e1.getEname()); Default value : null will be displayed
		// System.out.println(e1.getEid()); Default value : 0 will be displayed

		e1.setEid(100);
		e1.setEname("Appu");

		System.out.println(e1.getEname());
		System.out.println(e1.getEid());
		
		//System.out.println(eid);   cannot access private data memebers

	}

}
