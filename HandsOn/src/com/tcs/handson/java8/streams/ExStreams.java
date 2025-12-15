package com.tcs.handson.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ExStreams {
	public static void main(String[] args) {
		//find even
		List<Integer> al1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,8,6,5, 11, 12, 13));
		
		List<Integer> ans1 = al1.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
		System.out.println(ans1);
		
		
		List<String> al2 = new ArrayList<>(Arrays.asList("Apple", "Banana", "Orange", "Kiwi", "Guava", "Banana", "Guava"));
		List<String> ans2 = al2.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
		System.out.println(ans2);
		Set<Integer> hs = new HashSet<>();
		ans1 = al1.stream().filter(x -> !hs.add(x)).collect(Collectors.toList());
		System.out.println(ans1);
		
		int ans3 = al1.stream().filter(x -> x > 10).limit(1).collect(Collectors.toList()).get(0);
		System.out.println(ans3);
		
		ans1 = al1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(ans1);
		
		int sum = al1.stream().reduce(0, (a, b) -> a+b);
		System.out.println(sum);
		
		Map<String, Long> hm1 = al2.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting()));
		System.out.println(hm1);
		
		int ans4 = al1.stream().max((a, b) -> a - b).get();
		System.out.println(ans4);
		
		ArrayList<Integer> al3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
//		merge two lists and remove duplicates using streams
		
		List<Integer> ans5 = Arrays.asList(al1, al3).stream().flatMap(x -> x.stream()).distinct().collect(Collectors.toList());
		
		
		
		
		
		System.out.println(ans5);
		
//		reverse sort strings by length
		List<String> ans6 = al2.stream().sorted((a, b) -> a.length() == b.length() ? b.compareTo(a) : b.length() - a.length()).collect(Collectors.toList());
		System.out.println(ans6);
		
		
//		Square each number
		List<Integer> ans7 = al1.stream().map(x -> x * x).collect(Collectors.toList());
		System.out.println(ans7);
		
		String ans8 = al2.stream().collect(Collectors.joining(", "));
		System.out.println(ans8);
		
		Map<Integer, List<String>> hm2 = al2.stream().collect(Collectors.groupingBy(x -> x.length()));
		System.out.println(hm2);
		
//		min value in al1
		int ans9 = al1.stream().min((a, b) -> a - b).get();
		System.out.println(ans9);
		
		int ans10 = al1.stream().distinct().sorted().skip(1).limit(1).collect(Collectors.toList()).get(0);
		System.out.println(ans10);
		
		String s = "asjdbydbeuwdbejdcuhfuhcybgfgbe";
		
		Map<Character, Long> hm3 = s.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		System.out.println(hm3);
		
//		Polindrome check using streams
		
		boolean ans11 = s.equals(new StringBuilder(s).reverse().toString());
		System.out.println(ans11);
		
		List<Integer> ans12 = al1.stream().sorted().collect(Collectors.toList());
		System.out.println(ans12);
		
		List<String> ans13 = al2.stream().distinct().collect(Collectors.toList());
		System.out.println(ans13);
		
//		find first repeated character in a string
		char ans14 = s.chars().mapToObj(c -> (char)c).filter(c -> {
			int firstIndex = s.indexOf(c);
			int lastIndex = s.lastIndexOf(c);
			return firstIndex != lastIndex;
		}).findFirst().get();
		System.out.println(ans14);
		
	}
}
 