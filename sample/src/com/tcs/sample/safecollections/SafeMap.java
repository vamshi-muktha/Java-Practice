package com.tcs.sample.safecollections;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SafeMap {
	public static void main(String[] args) {
		Map<Integer, String> m = new ConcurrentHashMap<>();
		m.put(1,  "one");
		m.put(2,  "two");
		m.put(3,  "three");
		for(int i : m.keySet()) {
			m.put(4, "four");
			System.out.println(i + " " + m.get(i));
			m.put(5, "five");
		}

		System.out.println("size is " + m.size() + " "+ m);
	}
}
