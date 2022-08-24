package com.sbi.model;

public class SBISavingAccountInterestCalculator implements SBIInterestCalculator {

	private double roi = 5.5;

	@Override
	public double calculate(double amt) {
		return (roi / 100.0) * amt / 12.0;
	}

}
