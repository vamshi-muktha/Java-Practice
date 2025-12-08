package com.tcs.sample.constructor;

public class C {
	C(){
		System.out.println("default");
	}
	C(int a){
		this();
		System.out.println("one param");
	}
	C(int a, int b){
		this(a);
		System.out.println("two param");
	}
	C(int a, int b, int c){
		this(a, b);
		System.out.println("three param");
	}
}
