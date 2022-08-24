package com.kitchen;

public class ChineseKitchen implements Restaurant {

	@Override
	public String prepareDish(String dishName) {
		return "preparing '" + dishName + "' with chinese herbs and oil";
	}

}
