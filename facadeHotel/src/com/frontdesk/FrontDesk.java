package com.frontdesk;

import com.facade.HotelFacade;
import com.model.RoomType;

public class FrontDesk {

	public static void main(String[] args) {

		HotelFacade facade = new HotelFacade();
		facade.displayAvailableRooms();

		System.out.println(facade.reserveRoomForGuest(RoomType.SINGLE));
		System.out.println(facade.reserveRoomForGuest(RoomType.DOUBLE));
		System.out.println(facade.reserveRoomForGuest(RoomType.SINGLE));
		System.out.println(facade.reserveRoomForGuest(RoomType.DOUBLE));
		System.out.println(facade.reserveRoomForGuest(RoomType.SUITE));
		facade.displayAvailableRooms();

	}

}
