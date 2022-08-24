package com.roomservice;

import com.kitchen.Restaurant;

public class RoomService {

	private Restaurant restaurant;

	public RoomService(Restaurant restaurant) {
		super();
		this.restaurant = restaurant;
	}

	public String placeOrder(String dishName) {
		return restaurant.prepareDish(dishName);
	}
}
