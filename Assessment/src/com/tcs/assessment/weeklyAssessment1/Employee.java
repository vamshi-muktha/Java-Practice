package com.tcs.assessment.weeklyAssessment1;

public class Employee {
	private int eno;
	private String ename;
	private int sal;
	private String type;
	
	public Employee() {
		this.eno = 10;
		this.ename = "virat";
		this.sal = 100000;
		this.type = "Temperory";
	}
	public Employee(int eno, String ename, int sal, String type) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.sal = sal;
		this.type = type;
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
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String display() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", sal=" + sal + ", type=" + type + "]";
	}
	
	
}
