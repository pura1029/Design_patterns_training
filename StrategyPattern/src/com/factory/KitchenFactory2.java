package com.factory;

import java.util.HashMap;
import java.util.Map;

import com.kitchen.AmericanKitchen;
import com.kitchen.ChineseKitchen;
import com.kitchen.IndianRestaurant;
import com.kitchen.ItalianKitchen;
import com.kitchen.Restaurant;

public class KitchenFactory2 {

	private static Map<String, Restaurant> restaurantMap;

	static {
		restaurantMap = new HashMap<>();
		restaurantMap.put("IND", new IndianRestaurant());
		restaurantMap.put("ITA", new ItalianKitchen());
		restaurantMap.put("US", new AmericanKitchen());
		restaurantMap.put("CHI", new ChineseKitchen());
	}

	private KitchenFactory2() {
	}

	public static Restaurant getKitchen(String type) {
		return restaurantMap.get(type);
	}

}
