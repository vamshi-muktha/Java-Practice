package com.tcs.handson.collections.oned;

public class Employee implements Comparable<Employee> {
	private int eno;
	private String ename;
	private int sal;





	public Employee(int eno, String ename, int sal) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.sal = sal;
	}



	public Employee() {
		super();
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



	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", sal=" + sal + "]";
	}



	@Override
	public int compareTo(Employee o) {
		return this.getEname().compareTo(o.getEname());
	}






}
