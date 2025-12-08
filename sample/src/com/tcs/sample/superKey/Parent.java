package com.tcs.sample.superKey;

public class Parent extends GrandParent {
	Parent(){
		System.out.println("This is Parent default");
	}
	Parent(int a, int b){
		super(a, b);
		
		System.out.println("This is Parent parameter");
	}
}
