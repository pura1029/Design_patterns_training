package com.test;

import com.factory.InterestCalculatorFactory2;
import com.service.CalculatorService;

public class Test {
	public static void main(String arg[]) {
		//CalculatorService servicer = new CalculatorService(InterestCalculatorFactory.getInterestCalculator("SAVING"));
		CalculatorService servicer = new CalculatorService(InterestCalculatorFactory2.getInterestCalculator("SAVING"));
		System.out.println(
				"Interest for Savings Account for the amount 10000 [Current Month]: " + "" + servicer.service(10000));

	}
}
