package com.tcs.sample.interfaceex;

public class ExBank {
	public static void main(String[] args) {
		RBI b1 = new Icici();
		b1.deposit();
		b1.withdraw();
		b1.disBal();

		b1 = new Sbi();
		b1.deposit();
		b1.withdraw();
		b1.disBal();


		b1 = new Hdfc();
		b1.deposit();
		b1.withdraw();
		b1.disBal();
	}
}
