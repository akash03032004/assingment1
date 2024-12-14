package com.assinment1;

public class Developer extends Employee{
	

	private String programming;
	
	//constructor
	public Developer (String name,int employeeId,double salary,String programming) {
		super(name,employeeId,salary);
		this.programming=programming;
	}

	public String getProgramming() {
		return programming;
	}

	public void setProgramming(String programming) {
		this.programming = programming;
	}

	@Override
	public void displaydetails() {
		super.displaydetails();
		System.out.println("Programming:"+programming);
	}
}
