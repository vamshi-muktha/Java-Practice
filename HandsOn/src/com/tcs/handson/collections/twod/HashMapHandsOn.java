package com.tcs.handson.collections.twod;

import java.util.HashMap;
import java.util.TreeMap;

import com.tcs.handson.collections.oned.Employee;

public class HashMapHandsOn {
	public static void main(String[] args) {
		
		
		HashMap<Integer, Integer> hm = new HashMap<>();
		hm.put(1,  92);
		hm.put(2,  90);
		hm.put(3,  78);
		hm.put(4,  89);
		hm.put(5,  88);
		hm.put(6,  98);
		int sum = 0;
		int cnt = 0;
		for(int i : hm.keySet()) {
			if(i % 2 != 0) {
				sum += hm.get(i);
				cnt++;
			}
		}
		System.out.println("Second and Fifth Answer \n"+sum / (float)cnt);
		System.out.println("-------------------------------------------------------------------");
		
		int max = 0;
		for(int i : hm.keySet()) max = Math.max(i, max);
		System.out.println("Third Answer \n"+hm.get(max));
		System.out.println("-------------------------------------------------------------------");

		
		HashMap<Integer, String> hm1 = new HashMap<>();
		HashMap<Integer, Integer> hm2 = new HashMap<>();
		
		hm1.put(1, "Analyst");
		hm1.put(2,  "Programmer");
		hm1.put(3,  "Tester");
		hm1.put(4,  "Manager");
		
		hm2.put(4,  4000);
		hm2.put(3,  9000);
		hm2.put(1,  7000);
		hm2.put(2,  6000);
		
		int ManId = 0;
		for(int i : hm1.keySet()) {
			if(hm1.get(i).equals("Manager"))ManId = i;
		}
		
		System.out.println("Fourth Answer \n"+(hm2.get(ManId) + 5000));
		System.out.println("------------------------------------------------------------------------");
		
		TreeMap<Employee, Department> ed = new TreeMap<>((a, b) -> a.getEno() - b.getEno());
		ed.put(new Employee(1, "Virat", 9000), new Department(101, "Tech"));
		ed.put(new Employee(2, "Rohit", 9000), new Department(102, "Business"));
		ed.put(new Employee(9, "Rahul", 9000), new Department(103, "Hr"));
		ed.put(new Employee(12, "Dhawan", 9000), new Department(104, "Training"));
		System.out.println("Sixth Answer \n");
		for(Employee i : ed.keySet()) {
			System.out.println(i.toString() + "          " + ed.get(i).toString());
		}
		System.out.println("------------------------------------------------------------------------");
	}
}
