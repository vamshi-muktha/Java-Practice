package com.tcs.sample.java8.methodReference;

public class ExMethodReference {
		public static void main(String[] args) {
			I1 obj1 = () -> {
				System.out.println("This is I1 implementation with lambda");
			};
			obj1.method1();
			I2 obj2 = (a, b ) -> {
				System.out.println("This is I2 implementation with lambda");
			};
			obj2.method2(10, 20);
			C1 objc1 = new C1();
			
			I1 obj11 = objc1::m1;
			I1 obj12 = C1::new;
			I1 obj13 = C1::m2;
			
			I2 obj21 = objc1::m1;
			I2 obj22 = C1::new;
			I2 obj23 = C1::m2;
			
			
			obj11.method1();
			obj12.method1();
			obj13.method1();
			
			obj21.method2(10, 20);
			obj22.method2(10, 20);
			obj23.method2(10, 20);
		}
	
	
	
}
