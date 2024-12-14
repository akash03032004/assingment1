package com.assinment1;

public class Manager extends Employee{


	private int teamsize;

	public Manager(String name,int employeeId,double salary,int teamsize) {
		super(name, employeeId, salary);

		this.teamsize=teamsize;
	}
	
	public int getTeamsize() {
		return teamsize;
	}

	public void setTeamsize(int teamsize) {
		this.teamsize = teamsize;
	}

	@Override
	public void displydetails() {
		super.displaydetails();
		System.out.println("team size:"+teamsize);
		
	}

	

	
	
}
