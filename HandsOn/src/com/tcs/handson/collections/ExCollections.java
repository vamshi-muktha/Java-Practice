package com.tcs.handson.collections;

import java.util.TreeSet;

public class ExCollections {
	public static void main(String[] args) {
//		List<Account> al= new ArrayList<>();
//		al.add(new Account(5, "vamshi", 100));
//		al.add(new Account(2, "virat", 200));
//		al.add(new Account(10, "dhoni", 500));
//		al.add(new Account(11, "rohit", 50));
//		al.add(new Account(18, "washi", 90));
//		al.add(new Account(18, "jaddu", 90));
//		
//		for(Account ac : al) {
//			System.out.println(ac.toString());
//		}
//		
//		System.out.println("----------------------Sort based on accNo-----------------");
//		
//		Collections.sort(al, (a, b) -> a.getAccNo() - b.getAccNo());
//		
//		for(Account ac : al) {
//			System.out.println(ac.toString());
//		}
//		
//		System.out.println("-------------------------Sort based on bal-----------------");
//		
//		Collections.sort(al, (a, b) -> a.getBal() - b.getBal());
//		
//		for(Account ac : al) {
//			System.out.println(ac.toString());
//		}
//		
//		
//System.out.println("------------------Sort based on accNo and balance-----------------");
//		
//		Collections.sort(al, (a, b) -> a.getBal() == b.getBal() ? (a.getAccNo() - b.getAccNo()) : (a.getAccNo() - b.getAccNo()));
//		
//		for(Account ac : al) {
//			System.out.println(ac.toString());
//		}
		
		
		
		TreeSet<Account> ts = new TreeSet<>(new AccountCustsort());
		ts.add(new Account(110, "seenu", 8000, "1a"));
		ts.add(new Account(112, "seenu", 8000, "2a"));
		ts.add(new Account(111, "seenu", 8000, "4a"));
		ts.add(new Account(113, "seenu", 8000, "3a"));
		
		for(Account a : ts)System.out.println(a.toString());
	}
}
