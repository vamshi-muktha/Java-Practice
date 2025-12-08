package com.tcs.handson.inheritence;

public class Person {
	private String fname;
	private String lname;
	public Person(String fname, String lname) {
		this.fname = fname;
		this.lname = lname;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	void display() {
		System.out.println(fname + " " + lname);
	}

}
