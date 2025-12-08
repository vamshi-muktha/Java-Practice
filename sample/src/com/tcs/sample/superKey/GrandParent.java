package com.tcs.sample.superKey;

public class GrandParent {
	GrandParent(){
		System.out.println("This is GrandParent default");
	}
	GrandParent(int a, int b){
		this();
		System.out.println("This is GrandParent parameter");
	}
}
