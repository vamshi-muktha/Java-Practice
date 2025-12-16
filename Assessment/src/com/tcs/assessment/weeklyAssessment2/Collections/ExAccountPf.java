package com.tcs.assessment.weeklyAssessment2.Collections;

import java.util.SortedMap;
import java.util.TreeMap;

public class ExAccountPf {
	public static void main(String[] args) {
		SortedMap<Account, PF> tm = new TreeMap<>();
		tm.put(new Account(101, "Virat", 8000, 11), new PF(101, 5000));
		tm.put(new Account(102, "Dhoni", 5000, 12), new PF(104, 9000));
		tm.put(new Account(105, "Rahul", 8000, 13), new PF(103, 6000));
		tm.put(new Account(104, "Sachin", 3000, 14), new PF(105, 3000));
		tm.put(new Account(103, "Ganbhir", 2000, 15), new PF(106, 2000));
		tm.put(new Account(106, "Rohit", 6000, 16), new PF(102, 5000));
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("Sorting Based on Account No");
		System.out.println("Using Comparable");
		System.out.println("-------------------------------------------------------------------------");
		for(Account a : tm.keySet())System.out.println(a + "  " + tm.get(a));
		
		
		
		
		SortedMap<Account, PF> tm1 = new TreeMap<>((a, b) -> a.getUserid() - b.getUserid());
		tm1.put(new Account(101, "Virat", 8000, 11), new PF(101, 5000));
		tm1.put(new Account(102, "Dhoni", 5000, 12), new PF(104, 9000));
		tm1.put(new Account(105, "Rahul", 8000, 13), new PF(103, 6000));
		tm1.put(new Account(104, "Sachin", 3000, 14), new PF(105, 3000));
		tm1.put(new Account(103, "Ganbhir", 2000, 15), new PF(106, 2000));
		tm1.put(new Account(106, "Rohit", 6000, 16), new PF(102, 5000));
		
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("Sorting Based on User id");
		System.out.println("Using Custom Comparator using streams");
		System.out.println("-------------------------------------------------------------------------");
		for(Account a : tm1.keySet())System.out.println(a + "  " + tm1.get(a));
		
		
		SortedMap<Account, PF> tm2 = new TreeMap<>(new CustomSort());
		tm2.put(new Account(101, "Virat", 8000, 11), new PF(101, 5000));
		tm2.put(new Account(102, "Dhoni", 5000, 12), new PF(104, 9000));
		tm2.put(new Account(105, "Rahul", 8000, 13), new PF(103, 6000));
		tm2.put(new Account(104, "Sachin", 3000, 14), new PF(105, 3000));
		tm2.put(new Account(103, "Ganbhir", 2000, 15), new PF(106, 2000));
		tm2.put(new Account(106, "Rohit", 6000, 16), new PF(102, 5000));
		
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("Sorting Based on Balance");
		System.out.println("Using Custom Comparator from other class");
		System.out.println("-------------------------------------------------------------------------");
		for(Account a : tm2.keySet())System.out.println(a + "  " + tm2.get(a));
	}
}
