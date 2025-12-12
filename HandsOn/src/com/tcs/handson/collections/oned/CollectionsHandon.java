package com.tcs.handson.collections.oned;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionsHandon {
	public static void main(String[] args) {
		List<Integer> al = new ArrayList<>();
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(2);
		al.add(3);
		int max = 0;
		int ans = 0;
		for(int i = 0; i < al.size()-1; i++) {
			if(max < Math.abs(al.get(i) - al.get(i+1))) {
				max = Math.abs(al.get(i) - al.get(i+1));
				ans = i;
			}
		}
		System.out.println("First Answer\n");
		System.out.println("Largest diff gap el " + al.get(ans) + " at index " + ans);
		System.out.println("------------------------------------------------------------------------");


		
		ArrayList<Integer> al3 = new ArrayList<>(Arrays.asList(1, 5, 7, 7, 3, 9, 2));
		ArrayList<Integer> al4 = new ArrayList<>(Arrays.asList(9, 2, 6, 3, 9, 2, 7));
		List<Integer> res1 = new ArrayList<>();
		int sum1 = 0;
		for(int i = 0; i < al3.size(); i++) {
			if(al4.contains(al3.get(i))) {
				res1.add(al3.get(i));
				sum1 += al3.get(i);
			}
		}
		System.out.println("Second Answer\n");
		System.out.println(res1 + "sum = " + sum1);
		System.out.println("------------------------------------------------------------------------");

		ArrayList<Integer> al1 = new ArrayList<>(Arrays.asList(1, 5, 7, 7, 3, 9, 2));
		ArrayList<Integer> al2 = new ArrayList<>(Arrays.asList(9, 2, 6, 3, 9, 2, 7));
		List<Integer> res = new ArrayList<>();
		for(int i = 0; i < al1.size(); i++) {

			if(i % 2  == 0) {
				res.add(al1.get(i));
			} else {
				res.add(al2.get(i));
			}
		}
		System.out.println("Third Answer\n");
		System.out.println(res);
		System.out.println("------------------------------------------------------------------------");


		

		int[] arr = new int[10];
		for(int i = 0; i < 10; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
//			System.out.println(arr[i]);
		}
		int sum = 0;
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(isPrime(i)) {
				sum += arr[i];
				count++;
			}
		}
		System.out.println("Forth Answer\n");
		System.out.println(sum/(float)count);
		System.out.println("------------------------------------------------------------------------");

		int[] arr1 = {1, 2, 3, 4, 5, 6};
		int[] arr2 = {4, 5, 6, 7, 8, 9};
		ArrayList<Integer> res3 = new ArrayList<>();
		Set<Integer> hs = new HashSet<>();
		for(int i : arr1) {
			hs.add(i);
		}
		for(int i : arr2) {
			if(hs.contains(i)) {
				res3.add(i);
			}
		}
		hs.clear();
		for(int i : arr2) {
			hs.add(i);
		}
		for(int i : arr1) {
			if(hs.contains(i)) {
				res3.add(i);
			}
		}
		System.out.println("Fifth Answer\n");
		System.out.println("Size of common " + res3.size() + " and the common els are " + res3);
		System.out.println("------------------------------------------------------------------------");

	}

	private static boolean isPrime(int i) {
		if(i == 0 || i == 1) return false;
		for(int j = 2; j <= Math.sqrt(i); j++) if(i % j == 0) return false;
		return true;
	}
}
