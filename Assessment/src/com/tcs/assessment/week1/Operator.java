package com.tcs.assessment.week1;

public class Operator {
	int a, b, c, d;
	
	Operator(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	void sum() {
		this.c = this.a + this.b;
	}
	void mul() {
		this.d = this.a * this.b;
	}
	
	void setValues(int a, int b) {
		this.a = a;
		this.b = b;
	}
}
