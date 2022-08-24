package com.factory;

import com.commons.InterestCalculator;

public abstract class InterestFactoryAnyBank {

	public static InterestFactoryAnyBank getInterestFactory(char type) {

		switch (type) {
		case 'h':
			return new HDFCInterestFactory();

		case 'i':
			return new ICICIInterestFactory();

		case 's':
			return new SBIInterestFactory();

		}
		return null;
	}

	public abstract InterestCalculator create(char type);

}
