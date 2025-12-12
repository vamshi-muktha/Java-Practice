package com.tcs.sample.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Collections {
	public static void main(String[] args) {
		List list = new ArrayList<>();
		list.add(10);
		list.add("String");
		list.add(11.8);
		list.add(100);
		list.add(12.5);
		list.add(56);
		System.out.println(list);

		System.out.println(list.size());

		list.remove(10);
		list.remove(1);

		System.out.println(list);


		List ll = new LinkedList<>();
		ll.add(10);
		ll.add("String");
		ll.add(11.8);

		System.out.println(ll);

		System.out.println(ll.size());

		ll.remove(new Integer(10));
		ll.remove(1);

		System.out.println(ll);


		Set s = new HashSet<>();
		s.add(10);
		s.add("String");
		s.add(11.8);
		s.add(11.8);
		s.add(11.8);
		System.out.println(s);

		System.out.println(s.size());

		s.remove(new Integer(10));
		s.remove(1);

		System.out.println(s);

		Iterator ite = list.iterator();
		while(ite.hasNext()) {
			System.out.println((ite.next()).getClass().getName());
		}


		for(Object obj : list) {
			System.out.println(obj);
		}


		Set ss = new TreeSet<>();
		ss.add(10);
		ss.add(100);
		ss.add(11);
		ss.add(11);
		ss.add(1);
		ss.add(50);
		System.out.println(ss);

		System.out.println(ss.size());

		ss.remove(new Integer(10));

		ss.remove(1);

		System.out.println(ss);
		for(Object obj : ss) {
			System.out.println(obj.getClass().getName());
		}

	}
}
