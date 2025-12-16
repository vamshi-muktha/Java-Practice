package com.tcs.assessment.weeklyAssessment2.Collections;

public class PF {
	private int pfno;
	private int pfbal;
	public PF(int pfno, int pfbal) {
		super();
		this.pfno = pfno;
		this.pfbal = pfbal;
	}
	public int getPfno() {
		return pfno;
	}
	public void setPfno(int pfno) {
		this.pfno = pfno;
	}
	public int getPfbal() {
		return pfbal;
	}
	public void setPfbal(int pfbal) {
		this.pfbal = pfbal;
	}
	@Override
	public String toString() {
		return "PF [pfno=" + pfno + ", pfbal=" + pfbal + "]";
	}
	
	
}
