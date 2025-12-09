package com.tcs.handson.collections;

public class Account implements Comparable<Account>{
	private int accNo;
	private String accName;
	private int bal;
	public Account(int accNo, String accName, int bal) {
		super();
		this.accNo = accNo;
		this.accName = accName;
		this.bal = bal;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public int getBal() {
		return bal;
	}
	public void setBal(int bal) {
		this.bal = bal;
	}
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", accName=" + accName + ", bal=" + bal + "]";
	}
	@Override
	public int compareTo(Account ac) {
		return this.bal - ac.bal;
	}
	
	
	
}
