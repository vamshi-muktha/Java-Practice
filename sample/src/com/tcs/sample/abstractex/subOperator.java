package com.tcs.sample.abstractex;

public class subOperator extends Operator {
	@Override
	void ope(int a, int b) {
		System.out.println("Sub is : " +  (a - b));
	}
}
