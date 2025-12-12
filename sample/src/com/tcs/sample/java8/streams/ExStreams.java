package com.tcs.sample.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ExStreams {
	public static void main(String[] args) {
		
		List<Integer> al = Arrays.asList(1, 2, 3, 4, 9, 88, 77, 66, 55);
		Stream<Integer> s1 = al.stream();
		Stream<Integer> s2 = s1.filter(x -> x>=10);
		Stream<Integer> s3 = s2.filter(x -> x%11 == 0);
		s3.forEach(x->System.out.println(x));
		al.stream().filter(x -> x>=10).filter(x -> x%11 == 0).forEach(x -> System.out.println(x));
	}
}
