package com.sbi.model;

public class SBIFDAccountCalculator implements SBIInterestCalculator {
	private double roi = 6.0;
	private int duration = 6;

	@Override
	public double calculate(double amt) {
		return roi / 100.0 * amt * duration;
	}

}
