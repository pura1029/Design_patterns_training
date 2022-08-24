package com.roomguest;

import com.factory.KitchenFactory2;
import com.roomservice.RoomService;

public class RoomGuest {
	public static void main(String[] args) {
		//RoomService roomService = new RoomService(KitchenFactory.getKitchen("US"));
		RoomService roomService = new RoomService(KitchenFactory2.getKitchen("US"));

		System.out.println(roomService.placeOrder("Meatloaf"));
	}
}
