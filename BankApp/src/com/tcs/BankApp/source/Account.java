package com.tcs.BankApp.source;

public class Account {
	int ano;
	String aname;
	int bal;
	public Account(String aname) {
		this.ano = (int) (Math.random() * Math.pow(10,  5) + 1);
		this.aname = aname;
		this.bal = 0;
	}
	
	public void credit(int amt) {
		bal += amt;
		System.out.println("credit successful");
	}
	
	public void debit(int amt) {
		if(amt > bal) {
			System.out.println("You have low balance and your balance is " + bal);
		}
		else {
			bal -= amt;
			System.out.println("debit successful");
		}
	}
	public void getDetails() {
		System.out.println("Your Account Details:" + "\nAccount No : " + ano + "\nAccount name : " + aname + "\nBalance : " + bal);
	}
	
}
 