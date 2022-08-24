package com.icici.model;

public class ICICIFDAccountCalculator implements ICICIInterestCalculator {
	private double roi = 8.0;
	private int duration = 3;

	@Override
	public double calculate(double amt) {
		return roi / 100.0 * amt * duration;
	}

}
