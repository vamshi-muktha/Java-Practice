package com.tcs.sample.java8.streams;

import java.util.ArrayList;
import java.util.List;

public class Util2 {
	public static List<Integer> getNumbers(){
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 1; i <= 10; i++) {
			int a = (int)Math.random() * 10 + 1;
			al.add(a);
		}
		return al;
	}
}
