package com.tcs.sample.safecollections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SafeSet {
	public static void main(String[] args) {
		Set<Integer> s = new HashSet<>(Arrays.asList(1, 2, 3, 3, 5 ));
		try {
			for(int i : s) {
				s.add(9);
				System.out.println(s.size());
				System.out.println(i);
				s.add(11);
			}
		}catch(Exception e) {
			System.err.println(e);
		}
			
		System.out.println("size is " + s.size() + "    "+s);
	}
}
