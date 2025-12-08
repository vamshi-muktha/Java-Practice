package com.tcs.sample.interfaceex;

public class ExOperator {
	public static void main(String[] args) {
		Operator obj = new sumOperator();
		obj.ope(10, 20);
		obj = new subOperator();
		obj.ope(10, 20);
		
	}
}
