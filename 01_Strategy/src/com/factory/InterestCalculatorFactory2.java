package com.factory;

import java.util.HashMap;
import java.util.Map;

import com.model.FDAccountCalculator;
import com.model.InterestCalculator;
import com.model.SavingAccountInterestCalculator;

public class InterestCalculatorFactory2 {

	private static Map<String, InterestCalculator> map;

	static {
		map = new HashMap<>();
		map.put("SAVING", new SavingAccountInterestCalculator());
		map.put("FD", new FDAccountCalculator());
	}

	private InterestCalculatorFactory2() {
		super();
	}

	public static InterestCalculator getInterestCalculator(String accountType) {
		return map.get(accountType);
	}
}
