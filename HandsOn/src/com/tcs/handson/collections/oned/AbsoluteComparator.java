package com.tcs.handson.collections.oned;

import java.util.Comparator;

public class AbsoluteComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		return Math.abs(o1) - Math.abs(o2);
	}

}
