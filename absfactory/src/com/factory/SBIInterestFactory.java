package com.factory;

import com.sbi.model.SBIFDAccountCalculator;
import com.sbi.model.SBIInterestCalculator;
import com.sbi.model.SBISavingAccountInterestCalculator;

public class SBIInterestFactory extends InterestFactoryAnyBank {

	public SBIInterestFactory() {
		System.out.println("SBIInterestFactory");
	}
	
	public SBIInterestCalculator create(char type) {
		switch (type) {
		case 's':
			return new SBISavingAccountInterestCalculator();

		case 'f':
			return new SBIFDAccountCalculator();
		}
		return null;

	}

}
