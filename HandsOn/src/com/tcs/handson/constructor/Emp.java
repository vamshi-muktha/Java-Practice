package com.tcs.handson.constructor;

public class Emp {
	int eno;
	String ename;
	int sal;
	String type;
	public Emp() {
		eno = 10;
		ename = "abc";
		sal = 50000;
		type = "Permanent";
	}
	public Emp(int eno, String ename, int sal, String type) {
		this.eno = eno;
		this.ename = ename;
		this.sal = sal;
		this.type = type;
	}
	@Override
	public String toString() {
		return "Emp [eno=" + eno + ", ename=" + ename + ", sal=" + sal + ", type=" + type +		 "]";
	}


}
