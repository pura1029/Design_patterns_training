package com.kitchen;

public class AmericanKitchen implements Restaurant {

	@Override
	public String prepareDish(String dishName) {
		return "preparing '" + dishName + "' with american herbs and oil";
	}

}
