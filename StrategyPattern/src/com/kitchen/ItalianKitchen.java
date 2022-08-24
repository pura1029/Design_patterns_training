package com.kitchen;

public class ItalianKitchen implements Restaurant {

	@Override
	public String prepareDish(String dishName) {
		return "preparing '" + dishName + "' with italian herbs and oil";
	}

}
