package com.tcs.sample.java8.methodReference;

public class MathsOperations {
	
	
	MathsOperations(){}
	MathsOperations(int a, int b){
		System.out.println("Addition is : " + (a+b));
	}
	
	void mul(int a, int b) {
		System.out.println("Multiplication is : "+ (a*b));
	}
	
	static void div(int a, int b) {
		System.out.println("Division is : " + (a/b));
	}
}
