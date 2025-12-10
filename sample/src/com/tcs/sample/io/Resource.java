package com.tcs.sample.io;

public class Resource implements AutoCloseable{
	void m1() {
		System.out.println("In m1");
	}
	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Closing.....");
	}

}
