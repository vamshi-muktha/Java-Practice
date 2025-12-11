package com.tcs.sample.java8.functionalinterface;


@FunctionalInterface
public interface Message {
	void giveMessage();
	
	default void m1() {
		System.out.println("In m1");
	}
	
	static void m2() {
		System.out.println("In m2");
	}
}
