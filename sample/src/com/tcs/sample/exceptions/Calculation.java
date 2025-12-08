package com.tcs.sample.exceptions;

public class Calculation {
	void div(String input[]) throws ArrayIndexOutOfBoundsException, ArithmeticException, NumberFormatException{
		int a = Integer.parseInt(input[0]);
		int b = Integer.parseInt(input[1]);
		
		int c = a/b;
		
		System.out.println(c);
	}
	
}
