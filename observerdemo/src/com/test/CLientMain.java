package com.test;

import com.controller.Interest;
import com.model.ChangeProvider;
import com.views.View1;

public class CLientMain {
	public static void main(String[] args) {

		ChangeProvider provider = new ChangeProvider();

		View1 v1 = new View1(provider);

		v1.addInterest(Interest.BUSINESS_LOAN);
		provider.update(6.6, Interest.BUSINESS_LOAN);
		
		v1.addInterest(Interest.HOUSING_LOAN);
		provider.update(6.6, Interest.HOUSING_LOAN);
		
		v1.removeInterest(Interest.BUSINESS_LOAN);
		provider.update(6.6, Interest.BUSINESS_LOAN);
		
		provider.unregister(v1);
		
		v1.addInterest(Interest.BUSINESS_LOAN);// No effect because view has unregisterd
		provider.update(6.6, Interest.BUSINESS_LOAN);// No effect because view has unregisterd
		
		provider.register(v1);
		

		v1.addInterest(Interest.FDA);
		provider.update(6.6, Interest.FDA);
	}

}
