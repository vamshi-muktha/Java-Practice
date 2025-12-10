package com.tcs.handson.abstracthandson;

public abstract class Employee {
	private int eno;
	private String ename;


	abstract void jobs();
	abstract void timings();



	public Employee(int eno, String ename) {
		super();
		this.eno = eno;
		this.ename = ename;
	}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	void noticePeriod() {
		System.out.println("Notice period is 2 months");
	}
}
