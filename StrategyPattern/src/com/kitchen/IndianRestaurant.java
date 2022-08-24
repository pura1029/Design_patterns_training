package com.kitchen;

public class IndianRestaurant implements Restaurant{

	@Override
	public String prepareDish(String dishName) {
		return "preparing '" + dishName + "' with indian spices";
	}

}
