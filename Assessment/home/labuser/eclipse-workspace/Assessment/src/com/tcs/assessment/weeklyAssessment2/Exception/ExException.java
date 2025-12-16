package com.tcs.assessment.weeklyAssessment2.Exception;

import java.util.Scanner;

public class ExException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Unername : ");
		String un = sc.next();
		System.out.print("Enter Password : ");
		String pass = sc.next();
		System.out.println("-------------------------------------------------------------------------");
		ValidateUser vu = new ValidateUser();

		try {
			if(vu.validate(un, pass)) {
				System.out.println("Welcome to the Application");
				System.out.println("-------------------------------------------------------------------------");

			}

		} catch (LoginException e) {
			System.err.println("Invalid username and password try again");
			System.out.println("-------------------------------------------------------------------------");

		}

		sc.close();
	}

}
