package com.tcs.sample.exceptions;

public class ThrowExample {
public void div(int a, int b) throws ArithmeticException{
	if(b < 0) {
		ArithmeticException ae = new ArithmeticException("dont give negative for b");
		throw ae;
	}
	System.out.println("Values " + a  + " " + b);

}
}
