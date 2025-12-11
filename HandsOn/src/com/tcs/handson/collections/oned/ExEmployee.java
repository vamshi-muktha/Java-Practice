package com.tcs.handson.collections.oned;

import java.util.Set;
import java.util.TreeSet;

public class ExEmployee {
	public static void main(String[] args) {
		Set<Employee> s = new TreeSet<>();

		s.add(new Employee(1, "Virat", 10000));
		s.add(new Employee(2, "Rohit", 20000));
		s.add(new Employee(3, "Dhoni", 40000));
		s.add(new Employee(4, "Shikhar", 90000));

		System.out.println(s);


		Set<Employee> s1 = new TreeSet<>(new CustomSort());
		s1.add(new Employee(1, "Virat", 10000));
		s1.add(new Employee(2, "Rohit", 20000));
		s1.add(new Employee(3, "Dhoni", 40000));
		s1.add(new Employee(4, "Shikhar", 90000));
		System.out.println(s1);
		System.out.println("Descending Order---------------------------------------------");
		Set<Employee> s2 = new TreeSet<>((a, b) -> b.getEname().compareTo(a.getEname()));
		s2.add(new Employee(1, "Virat", 10000));
		s2.add(new Employee(2, "Rohit", 20000));
		s2.add(new Employee(3, "Dhoni", 40000));
		s2.add(new Employee(4, "Shikhar", 90000));
		System.out.println(s2);
	}
}
