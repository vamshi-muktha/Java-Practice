package com.tcs.handson.collections;

import java.util.Comparator;

public class AccountCustsort implements Comparator<Account> {

	@Override
	public int compare(Account o1, Account o2) {
		return o1.getCustId().compareTo(o2.getCustId());
	}

}
