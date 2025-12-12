package com.tcs.sample.java8.streams;

public class Employee {
	private int eno;
	private String ename;
	private int bal;
	public Employee(int eno, String ename, int bal) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.bal = bal;
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
	public int getBal() {
		return bal;
	}
	public void setBal(int bal) {
		this.bal = bal;
	}
	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", bal=" + bal + "]";
	}


}
