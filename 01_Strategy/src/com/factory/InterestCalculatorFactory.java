package com.factory;

import com.model.FDAccountCalculator;
import com.model.InterestCalculator;
import com.model.SavingAccountInterestCalculator;

public class InterestCalculatorFactory {

	private InterestCalculatorFactory() {
		super();
	}

	public static InterestCalculator getInterestCalculator(String accountType) {
		switch (accountType) {
		case "SAVING":
			return new SavingAccountInterestCalculator();
		case "FD":
			return new FDAccountCalculator();
		default:
			return null;
		}
	}
}
