package com.tcs.sample.interfaceex;

public class Hdfc extends Bank{

	@Override
	public void deposit() {
		System.out.println("Min is 1000");

	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("Min is 500");
	}

}
