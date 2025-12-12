package com.tcs.sample.java8.functionalinterface;

import java.util.Comparator;
import java.util.TreeSet;



public class ExAccount {
	public static void main(String[] args) {
		Comparator<Account> c1 = new Comparator<>() {

			@Override
			public int compare(Account o1, Account o2) {
				return o1.getCustId().compareTo(o2.getCustId());
			}
		};

		TreeSet<Account> ts1 = new TreeSet<>(c1);
		ts1.add(new Account(110, "seenu", 8000, "1a"));
		ts1.add(new Account(112, "seenu", 8000, "2a"));
		ts1.add(new Account(111, "seenu", 8000, "4a"));
		ts1.add(new Account(113, "seenu", 8000, "3a"));

		System.out.println(ts1);

		Comparator<Account> c2 = (o1, o2) -> {


					return o1.getCustId().compareTo(o2.getCustId());

			};

		TreeSet<Account> ts2 = new TreeSet<>(c2);
		ts2.add(new Account(110, "seenu", 8000, "1a"));
		ts2.add(new Account(112, "seenu", 8000, "2a"));
		ts2.add(new Account(111, "seenu", 8000, "4a"));
		ts2.add(new Account(113, "seenu", 8000, "3a"));
		System.out.println(ts2);



		TreeSet<Account> ts3 = new TreeSet<>((a, b) -> b.getCustId().compareTo(a.getCustId()));
		ts3.add(new Account(110, "seenu", 8000, "1a"));
		ts3.add(new Account(112, "seenu", 8000, "2a"));
		ts3.add(new Account(111, "seenu", 8000, "4a"));
		ts3.add(new Account(113, "seenu", 8000, "3a"));
		System.out.println(ts3);



	}
}
