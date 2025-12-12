package com.tcs.sample.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any inps");

		try {
			int a = sc.nextInt();
			int b = sc.nextInt();

			int c = a/b;

			System.out.println("div is " + c);
		}
		catch(InputMismatchException ime) {
			System.out.println("give only numbers");
		}
		catch(NumberFormatException ime) {
			System.out.println("give only numbers");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("give only numbers");
		}
	}

}
