package com.tcs.sample.java8.functionalinterface;

public class ExMessage {
	public static void main(String[] args) {
		Message m1 = () -> {System.out.println("Good Morning");};
		m1.giveMessage();
		Message m2 = () -> {System.out.println("Good Afternoon");};
		m2.giveMessage();
		
		m1.m1();
		Message.m2();
	
		
	}
}
