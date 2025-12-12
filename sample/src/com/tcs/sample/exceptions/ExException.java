package com.tcs.sample.exceptions;

import java.util.Scanner;

public class ExException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter un, pass");
		String un = sc.next();
		String pass = sc.next();

		ValidateUser vu = new ValidateUser();

		try {
			if(vu.validate(un, pass)) {
				System.out.println("Welcome to the Application");
			}

		} catch (LoginException e) {
			System.err.println("Invalid user");
		}

		sc.close();
	}

}
