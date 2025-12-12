package com.tcs.sample.interfaceex;

public class Icici extends Bank {

	@Override
	public void deposit() {
		System.out.println("Min is 500");

	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("Min is 100");
	}

}
