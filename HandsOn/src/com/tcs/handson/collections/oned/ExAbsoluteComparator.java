package com.tcs.handson.collections.oned;

import java.util.Set;
import java.util.TreeSet;

public class ExAbsoluteComparator {
	public static void main(String[] args) {
		Set<Integer> ts = new TreeSet<>(new AbsoluteComparator());
		ts.add(1);
		ts.add(-1);
		ts.add(-11);
		ts.add(90);
		ts.add(-88);
		ts.add(88);
		ts.add(12);
		ts.add(-12);
		System.out.println(ts);
		
	}
}
