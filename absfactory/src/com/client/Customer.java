package com.client;

import com.commons.InterestCalculator;
import com.factory.InterestFactoryAnyBank;

public class Customer {

	public static void main(String[] args) {
		InterestFactoryAnyBank factory = InterestFactoryAnyBank.getInterestFactory('s');

		InterestCalculator ic = (InterestCalculator) factory.create('f');

		System.out.println(ic.calculate(77689));

	}

}
