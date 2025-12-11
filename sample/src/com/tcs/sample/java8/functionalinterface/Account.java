package com.tcs.sample.java8.functionalinterface;

public class Account implements Comparable<Account>{
	private int accNo;
	private String accName;
	private int bal;
	private String custId;
	public Account(int accNo, String accName, int bal, String cusId) {
		super();
		this.accNo = accNo;
		this.accName = accName;
		this.bal = bal;
		this.custId = cusId;
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
		return "Account [accNo=" + accNo + ", accName=" + accName + ", bal=" + bal + ", cusId=" + custId + "]";
	}
	@Override
	public int compareTo(Account ac) {
		return this.bal - ac.bal;
	}
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}



}
