package com.hdfc.model;

public class HDFCFDAccountCalculator implements HDFCInterestCalculator {
	private double roi = 5.0;
	private int duration = 6;

	@Override
	public double calculate(double amt) {
		return roi / 100.0 * amt * duration;
	}

}
