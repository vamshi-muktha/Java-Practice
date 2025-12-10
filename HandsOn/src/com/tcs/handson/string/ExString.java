package com.tcs.handson.string;

public class ExString {
	public static void main(String[] args) {


		StringHelperFunctions obj = new StringHelperFunctions();
		
		
		System.out.println("PPT Answer 1\n");
		System.out.println("----------------------------------------------------------------------------");
		String s1 = "Tom: I am from Australia";
		String s2 = "Rick: I am from Canada";

		obj.printNameAndCountry(s1);
		obj.printNameAndCountry(s2);
		System.out.println("----------------------------------------------------------------------------");

		String s3 = "arun#12#12#12";
		String s4 = "deepak#12#12#13";
		System.out.println("PPT Answer 2\n");
		System.out.println("----------------------------------------------------------------------------");
		obj.findMax(s3, s4);
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("PPT Answer 3\n");
		System.out.println("----------------------------------------------------------------------------");
		obj.concat("aaa", "bbb");
		obj.concat("hi", "hello");
		obj.concat("hello", "hi");
		System.out.println("----------------------------------------------------------------------------");

		System.out.println("PPT Answer 4\n");
		System.out.println("----------------------------------------------------------------------------");
		int ans = obj.countVowels(s1);
		
		System.out.println(ans);
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("Answer 1\n");
		System.out.println("----------------------------------------------------------------------------");
		System.out.println(obj.sumOfDigits("$$$1(((2***4)))3"));
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("Answer 2\n");
		System.out.println("----------------------------------------------------------------------------");
		obj.exchange(s1);
		System.out.println("----------------------------------------------------------------------------");
		
		System.out.println("Answer 3\n");
		System.out.println("----------------------------------------------------------------------------");
		String[] arrCap = {"Tamilnadu_Chennai", "Karnataka_Banglore"};
		System.out.println(obj.findCap(arrCap, "Karnataka" ));
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("Answer 4\n");
		System.out.println("----------------------------------------------------------------------------");
		System.out.println(obj.validateEmail("abc@gamil.com"));
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("Answer 5\n");
		System.out.println("----------------------------------------------------------------------------");
		System.out.println(obj.count(s1));
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("Answer 6\n");
		System.out.println("----------------------------------------------------------------------------");
		System.out.println(obj.hiBye("Hi How are you Bye").trim());
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("Basic Programs #@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@");
		System.out.println("----------------------------------------------------------------------------");
		System.out.println(obj.findMax(s1));
		System.out.println("----------------------------------------------------------------------------");
		System.out.println(obj.isPolindrome(s1));
		System.out.println("----------------------------------------------------------------------------");
		
		String[] emails = {"abc@gamil.com", "abc@tcs.com", "trs@tcs.com"};
		System.out.println(obj.findTcsEmails(emails));
		System.out.println("----------------------------------------------------------------------------");
		
		
	}
}
