package com.tcs.sample.interfaceex;

public class sumOperator implements Operator{
	@Override
	public void ope(int a, int b) {
		System.out.println("Sum is : " +  (a + b));
	}
}
