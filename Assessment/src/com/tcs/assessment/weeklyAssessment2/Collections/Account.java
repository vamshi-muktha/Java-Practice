package com.tcs.assessment.weeklyAssessment2.Collections;

public class Account implements Comparable<Account>{
	private int ano;
	private String ename;
	private int bal;
	private int userid;
	public Account(int ano, String ename, int bal, int userid) {
		super();
		this.ano = ano;
		this.ename = ename;
		this.bal = bal;
		this.userid = userid;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getBal() {
		return bal;
	}
	public void setBal(int bal) {
		this.bal = bal;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	@Override
	public String toString() {
		return "Account [ano=" + ano + ", ename=" + ename + ", bal=" + bal + ", userid=" + userid + "]";
	}
	@Override
	public int compareTo(Account o) {
		return this.getAno() - o.getAno();
	}
	
	
}
