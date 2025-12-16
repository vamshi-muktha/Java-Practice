package com.tcs.assessment.weeklyAssessment2.Collections;

import java.util.Comparator;

public class CustomSort implements Comparator<Account> {

	@Override
	public int compare(Account o1, Account o2) {
		return o1.getBal() - o2.getBal();
	}

}
