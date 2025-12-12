package com.tcs.sample.safecollections;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SafeList {
	public static void main(String[] args) {
		List<Integer> al = new CopyOnWriteArrayList<>(Arrays.asList(1, 2, 3, 4));
		for(int i : al) {
			al.add(8);
			System.out.println(i);
			al.add(13);
		}
		System.out.println("Length is " + al.size() + "   " + al);

	}
}
