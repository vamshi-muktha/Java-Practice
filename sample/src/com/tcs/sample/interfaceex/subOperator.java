package com.tcs.sample.interfaceex;

public class subOperator implements Operator {
	@Override
	public void ope(int a, int b) {
		System.out.println("Sub is : " +  (a - b));
	}
}
