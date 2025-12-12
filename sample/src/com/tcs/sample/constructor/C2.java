package com.tcs.sample.constructor;

public class C2 extends C1 {

	int x;
	int y;


	public C2(int x, int y, int a, int b) {
		this.x = x;
		this.y = y;
		this.a = a;
		this.b = b;
	}


	@Override
	public String toString() {
		return "C2 [x=" + x + ", y=" + y + ", a=" + a + ", b=" + b + "]";
	}
}
