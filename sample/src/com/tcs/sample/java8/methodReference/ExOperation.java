package com.tcs.sample.java8.methodReference;

public class ExOperation {
	public static void main(String[] args) {
		Operation ope = (a, b) -> System.out.println("Subtraction is : " + (a-b));
		ope.performOperation(20, 10);
		
		MathsOperations obj = new MathsOperations();
		
		ope = MathsOperations::new;
		ope.performOperation(20, 10);
		
		ope = obj::mul;
		ope.performOperation(20, 10);
		
		ope = MathsOperations::div;
		ope.performOperation(20, 10);
		
		
	}
}
