package com.factory;

import com.kitchen.AmericanKitchen;
import com.kitchen.ChineseKitchen;
import com.kitchen.IndianRestaurant;
import com.kitchen.ItalianKitchen;
import com.kitchen.Restaurant;

public class KitchenFactory {

	private KitchenFactory() {
	}

	public static Restaurant getKitchen(String type) {
		switch (type) {
		case "IND":
			return new IndianRestaurant();
		case "ITA":
			return new ItalianKitchen();
		case "US":
			return new AmericanKitchen();
		case "CHI":
			return new ChineseKitchen();
		default:
			return null;
		}
	}

}
