package com.tcs.handson.collections.oned;

import java.util.Comparator;

public class CustomSort implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getEname().compareTo(o2.getEname());
	}

}
