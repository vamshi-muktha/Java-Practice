package com.tcs.sample.java8.methodReference;

public class C1 {

	C1(){
		System.out.println("In class c1 constructorwith no params");
	}

	C1(int a, int b){
		System.out.println("In class c1 constructor with param" + " sum is " + a+b);
	}

	void m1() {
		System.out.println("In class c1 method with no params");
	}
	void m1(int a, int b) {
		int c = (a+b);
		System.out.println("In class c1 method with params" + " c is " + c);
	}

	static void m2() {
		System.out.println("In class c1 static method with no params");
	}


	static void m2(int a, int b) {
		int c = a+b;
		System.out.println("In class c1 static method with params " + c);
	}

}
