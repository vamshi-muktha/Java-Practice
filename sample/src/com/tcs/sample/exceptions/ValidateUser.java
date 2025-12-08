package com.tcs.sample.exceptions;

public class ValidateUser {
	public boolean validate(String un, String pass) throws LoginException {
		if(un.equals("admin") && pass.equals("admin123"))return true;
		else {
			LoginException le = new LoginException("Invalid");
			throw le;
		}
		
	}
}
