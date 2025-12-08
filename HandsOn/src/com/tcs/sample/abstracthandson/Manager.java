package com.tcs.sample.abstracthandson;

public class Manager extends Employee {
	public Manager(int eno, String ename) {
		super(eno, ename);
		// TODO Auto-generated constructor stub
	}

	@Override


	void jobs() {
		// TODO Auto-generated method stub
		System.out.println("Manager Job");
	}

	@Override
	void timings() {
		// TODO Auto-generated method stub
		System.out.println("Manager Timings");
	}
}
