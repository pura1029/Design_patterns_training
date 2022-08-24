package com.factory;

import com.hdfc.model.HDFCFDAccountCalculator;
import com.hdfc.model.HDFCInterestCalculator;
import com.hdfc.model.HDFCSavingAccountInterestCalculator;

public class HDFCInterestFactory extends InterestFactoryAnyBank {

	public HDFCInterestFactory() {
		System.out.println("HDFCInterestFactory");
	}
	
	public HDFCInterestCalculator create(char type) {
		switch (type) {
		case 's': return new HDFCSavingAccountInterestCalculator();
			
		case 'f': return new HDFCFDAccountCalculator();	

		 
		}
		return null;
		 
		
	}

}
