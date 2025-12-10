package com.tcs.handson.exception;

public class ValidatePassword  {

	public boolean validate(String pass) throws PasswordException {
		if(pass.length() > 6 && pass.length() <= 10 && contains(pass)) {
			return true;
		} else {
			PasswordException pe = new PasswordException("Invalid");
			throw pe;

		}
	}

	private boolean contains(String pass) {
		boolean digit = false;
		boolean sp = false;
		for(char ch : pass.toCharArray()) {

			if(Character.isDigit(ch)) {
				digit  = true;
			}
			if(!Character.isAlphabetic(ch) && !Character.isDigit(ch)) {
				sp = true;
			}

		}
		return sp && digit;
	}

}
