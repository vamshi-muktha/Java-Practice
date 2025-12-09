package com.tcs.assessment.weeklyAssessment1;

public class AccountEx {
	public static void main(String[] args) {
		Account sa = new SavingsAccount(1, "ICICI", 0, "Savings");
		Account ca = new CurrentAccount(2, "SBI", 0, "Current");
		
		sa.deposit(1000);
		sa.withdraw(500);
		System.out.println("Balance in your savings account");
		sa.showBal();
		
		ca.deposit(100000);
		ca.withdraw(45000);
		System.out.println("Balance in your current account");
		
		ca.showBal();
	}
}
