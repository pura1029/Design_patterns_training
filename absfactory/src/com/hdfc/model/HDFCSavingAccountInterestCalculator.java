package com.hdfc.model;

public class HDFCSavingAccountInterestCalculator implements HDFCInterestCalculator {

	private double roi = 4.5;

	@Override
	public double calculate(double amt) {
		return (roi / 100.0) * amt / 12.0;
	}

}
