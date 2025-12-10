package com.tcs.sample.exceptions;

public class ExThrow {
	public static void main(String[] args) {
		try {
			ThrowExample te = new ThrowExample();
			te.div(10, -11);
			
		}
		catch(Exception e){
			System.err.println("dont give neg vales");
		}
		
	}
}
