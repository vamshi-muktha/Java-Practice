package com.tcs.sample.java8.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SuppressWarnings("unused")
public class ExStreams {
	public static void main(String[] args) {

//		List<Integer> al = Arrays.asList(1, 2, 3, 4, 9, 88, 77, 66, 55);
//		Stream<Integer> s1 = al.stream();
//		Stream<Integer> s2 = s1.filter(x -> x>=10);
//		Stream<Integer> s3 = s2.filter(x -> x%11 == 0);
//		s3.forEach(x->System.out.println(x));
//		al.stream().filter(x -> x>=10).filter(x -> x%11 == 0).forEach(x -> System.out.println(x));

//		forEach Method
		List<Employee> al1 = Util.getEmps();
		Stream<Employee> st = al1.stream();
		st.forEach(x -> System.out.println(x));

//		Filter Example
//		Greater than 5000
		System.out.println("Greater Than 5000");
		al1.stream().filter(x -> x.getBal() >= 5000).forEach(x -> System.out.println(x));

//		Map Example

		al1.stream().map(x -> x.getEname()).forEach(x -> System.out.println(x));
		al1.stream().map(x -> x.getEno()).forEach(x -> System.out.println(x));
//		Using Method ref
		al1.stream().map(x -> x.getEno()).forEach(System.out::println);
//		Salaries which are less than 5000
		al1.stream().filter(x -> x.getBal() < 5000).map(x -> x.getBal()).forEach(x -> System.out.println(x));

//		Collect Example
		List<String> res1 = al1.stream().map(x -> x.getEname()).collect(Collectors.toList());
		System.out.println(res1);

//		Emp names into list emp no > 103
		res1 = al1.stream().filter(x -> x.getEno() > 103).map(x -> x.getEname()).collect(Collectors.toList());
		System.out.println(res1);

//		Distinct employee names using collect + distinct()
		List<String> distinctNames = al1.stream().map(Employee::getEname).distinct().collect(Collectors.toList());
		System.out.println("Distinct Names: " + distinctNames);

//		Ascending Order Sorting of Employee Names
		List<String> sortedNames = al1.stream().map(Employee::getEname).sorted().collect(Collectors.toList());
		System.out.println("Sorted Names: " + sortedNames);

//		Descending Order Sorting of Employee Names
		List<String> descSortedNames = al1.stream().map(Employee::getEname)
				.sorted((name1, name2) -> name2.compareTo(name1)).collect(Collectors.toList());

		System.out.println("Desc Sorted Names: " + descSortedNames);

//		Descending Order Sorting of Employee Names using Comparator
		List<String> descSortedNames2 = al1.stream().map(Employee::getEname).sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		System.out.println("Desc Sorted Names 2: " + descSortedNames2);


//		Take one list and count even numbers
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		long count = numbers.stream().filter(x -> x % 2 == 0).count();
		System.out.println("Count of Even Numbers: " + count);


//		square each number in numbers list and collect to a new list
		List<Integer> sq = numbers.stream().map(x -> x * x).collect(Collectors.toList());
		System.out.println("Squared Numbers: " + sq);

//		find even multiply with 3 and sort and collect
		List<Integer> m3sc = numbers.stream()
				.filter(x -> x % 2 == 0)
				.map(x -> x * 3)
				.sorted()
				.collect(Collectors.toList());
		System.out.println("Processed Numbers: " + m3sc);

//		skip and limit
		List<Integer> skipLimit = numbers.stream()
				.skip(2) // skip first 2 elements
				.limit(5) // take next 5 elements
				.collect(Collectors.toList());
		System.out.println("Skip 2 and Limit 5: " + skipLimit);

//		wap to find 3rd max number
		List<Integer> thirdMax = numbers.stream()
				.sorted(Comparator.reverseOrder())
				.skip(2)
				.limit(1).collect(Collectors.toList());
		System.out.println("3rd Max Number: " + thirdMax);


//		AnyMatch Example
		boolean hasHighSalary = al1.stream().anyMatch(x -> x.getBal() > 10000);
		System.out.println("Any Employee with salary > 10000: " + hasHighSalary);

//		AllMatch Example
		boolean allHighSalary = al1.stream().allMatch(x -> x.getBal() > 5000);
		System.out.println("All Employees with salary > 5000: " + allHighSalary);


//		NoneMatch Example
		boolean noneLowSalary = al1.stream().noneMatch(x -> x.getBal() < 1000);
		System.out.println("No Employee with salary < 1000: " + noneLowSalary);

//		min and max in list of numbers
		Integer minNum = numbers.stream().min((x, y) -> x - y).orElse(null);
		System.out.println("Minimum Number: " + minNum);

		Integer maxNum = numbers.stream().max(Integer::compare).orElse(null);
		System.out.println("Maximum Number: " + maxNum);


		Employee minSalEmp = al1.stream().min(Comparator.comparing(Employee::getBal)).orElse(null);
		System.out.println("Employee with Minimum Salary: " + minSalEmp);

		Employee maxSalEmp = al1.stream().max(Comparator.comparing(Employee::getBal)).orElse(null);
		System.out.println("Employee with Maximum Salary: " + maxSalEmp);

//		findFirstExample
		Integer firstEven = numbers.stream().filter(x -> x % 2 == 0).findFirst().orElse(null);
		System.out.println("First Even Number: " + firstEven);

		Employee firstHighSalEmp = al1.stream().filter(x -> x.getBal() > 5000).findFirst().orElse(null);
		System.out.println("First Employee with Salary > 5000: " + firstHighSalEmp);


//		reduce
		Integer sum = numbers.stream().reduce(100, (a, b) -> a + b);
		System.out.println("Sum of Numbers: " + sum);

		Integer product = numbers.stream().reduce(1, (a, b) -> a * b);
		System.out.println("Product of Numbers: " + product);

		Integer maxUsingReduce = numbers.stream().reduce(Integer::max).orElse(null);
		System.out.println("Maximum using Reduce: " + maxUsingReduce);

		Integer minUsingReduce = numbers.stream().reduce(Integer::min).orElse(null);
		System.out.println("Minimum using Reduce: " + minUsingReduce);

	}
}