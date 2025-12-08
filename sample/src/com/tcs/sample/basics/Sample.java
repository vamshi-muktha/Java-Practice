package com.tcs.sample.basics;


public class Sample {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		e2.setValues(3, "ram", 7000);
		e1.displayInfo();
		e2.displayInfo();
	}
}
