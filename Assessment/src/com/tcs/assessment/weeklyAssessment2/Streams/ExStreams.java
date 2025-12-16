package com.tcs.assessment.weeklyAssessment2.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExStreams {
	public static void main(String[] args) {
		List<String> al = new ArrayList<>(Arrays.asList("abc", "pqr", "def"));
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("Changing to uppercase");
		System.out.println("-------------------------------------------------------------------------");
		List<String> ans1 = al.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
		System.out.println(ans1);
		
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("Finding Length of word");
		System.out.println("-------------------------------------------------------------------------");
		List<String> ans2 = al.stream().map(x -> x + " : Length : " + x.length()).collect(Collectors.toList());
		System.out.println(ans2);
	}
}
