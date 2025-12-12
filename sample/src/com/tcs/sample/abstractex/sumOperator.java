package com.tcs.sample.abstractex;

public class sumOperator extends Operator{
	@Override
	void ope(int a, int b) {
		System.out.println("Sum is : " +  (a + b));
	}
}
