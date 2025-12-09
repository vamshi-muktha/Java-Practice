package com.tcs.assessment.weeklyAssessment1;

public class SavingsAccount extends Account {

	public SavingsAccount(int accNo, String aname, int bal, String type) {
		super(accNo, aname, bal, type);
		// TODO Auto-generated constructor stub
	}

	@Override
	void deposit(int amt) {
		if(amt < 100 || amt > 100000)System.out.println("Min is 100 and max is 1L");
		this.setBal(this.getBal() + amt);
		
	}

	@Override
	void withdraw(int amt) {
		if(amt < 100 || amt > 10000)System.out.println("Min is 100 and max is 10000");
		if(amt > this.getBal())System.out.println("your balance is " + this.getBal());
		this.setBal(this.getBal() - amt);
		
	}
	
}
