package com.tcs.assessment.week1;

public class OperatorEx {
	public static void main(String[] args) {
		Operator obj = new Operator(10, 20);
		obj.sum();
		obj.mul();
		System.out.println("c : " + obj.c + "    d : " + obj.d);
		obj.setValues(100, 200);
		obj.sum();
		obj.mul();
		System.out.println("c : " + obj.c + "    d : " + obj.d);
	}
}
