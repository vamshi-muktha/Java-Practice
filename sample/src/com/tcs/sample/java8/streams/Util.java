package com.tcs.sample.java8.streams;

import java.util.ArrayList;
import java.util.List;

public class Util {
	static List<Employee> getEmps(){
		List<Employee> al = new ArrayList<Employee>();
		al.add(new Employee(101, "Virat", 3000));
		al.add(new Employee(102, "Rohit", 5000));
		al.add(new Employee(103, "Dhoni", 9000));
		al.add(new Employee(104, "Rahul", 2000));
		al.add(new Employee(105, "Kohli", 11000));
		
		return al;
	}

	
}
