package com.factory;

import com.commons.InterestCalculator;
import com.icici.model.ICICIFDAccountCalculator;
import com.icici.model.ICICISavingAccountInterestCalculator;

public class ICICIInterestFactory extends InterestFactoryAnyBank {

	public ICICIInterestFactory() {
		System.out.println("ICICIInterestFactory");
	}
	
	@Override
	public InterestCalculator create(char type) {
		switch (type) {
		case 's': return new ICICISavingAccountInterestCalculator();
			
		case 'f': return new ICICIFDAccountCalculator();	

		 
		}
		return null;
		 
		

}}
