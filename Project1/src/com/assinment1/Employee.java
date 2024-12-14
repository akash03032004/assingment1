package com.assinment1;

public class Employee {
	private String name;
	private int employeeId;
	private double salary;
	
	public Employee(String name, int employeeId, double salarey) {
		this.name=name;
		this.employeeId=employeeId;
		this.salary=salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public double getSalery() {
		return salary;
	}

	public void setSalery(double salary) {
		this.salary = salary;
	}
	public void displaydetails() {
		System.out.println("Name:"+name);
		System.out.println("EmployeeId:"+ employeeId);
		System.out.println("Salary: $"+salary);
	}

	public void displydetails() {
		// TODO Auto-generated method stub
		
	}


}
