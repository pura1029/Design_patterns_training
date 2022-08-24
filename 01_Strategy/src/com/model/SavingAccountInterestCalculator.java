package com.model;

public class SavingAccountInterestCalculator implements InterestCalculator {

	private double roi = 3.5;

	@Override
	public double calculate(double amt) {
		return (roi / 100.0) * amt / 12.0;
	}

}
