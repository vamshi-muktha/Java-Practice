package com.tcs.sample.java8.inbuiltfunctionalinterfaces;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Execution {
	public static void main(String[] args) {
		UnaryOperator<Integer> un = (x) -> x*x;
		BinaryOperator<Integer> bno = (x, y) -> x*y;
		Function<String, Integer> fn = (a) -> a.length();
		BiFunction<String, Integer, String> bif = (a, b) -> a.substring(b);
		Predicate<Integer> p = (a) -> a % 2  == 0;
		BiPredicate<String, Integer> bip = (a, b) -> a.length() == b;
		Supplier<Integer> sup = () -> 12;
//		Consumer<Integer> con =

		System.out.println(un.apply(10));
		System.out.println(bno.apply(10,  20));
		System.out.println(fn.apply("abc"));
		System.out.println(bif.apply("vamshi", 2));
		System.out.println(p.test(6));
		System.out.println(bip.test("Virat", 20));

	}
}
