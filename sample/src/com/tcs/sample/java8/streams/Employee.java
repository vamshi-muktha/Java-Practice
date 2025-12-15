package com.tcs.sample.java8.streams;

public class Employee {
	private int eno;
	private String ename;
	private int bal;
	private String depno;
	public Employee(int eno, String ename, int bal) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.bal = bal;
	}
	
	
	public Employee(int eno, String ename, int bal, String depno) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.bal = bal;
		this.depno = depno;
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
	public String  getDepno() {
		return depno;
	}
	public void setDepno(String depno) {
		this.depno = depno;
	}


}
