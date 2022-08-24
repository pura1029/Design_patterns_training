package com.facade;

import java.util.List;
import java.util.stream.Collectors;

import com.model.HotelSearchService;
import com.model.Room;
import com.model.RoomType;

public class HotelFacade {

	HotelSearchService service;

	public HotelFacade() {
		service = new HotelSearchService();
		for (int i = 0; i < 20; i++) {
			if (i % 2 == 0)
				service.addRoom(new Room(i + 1, RoomType.SINGLE, true));
			else
				service.addRoom(new Room(i + 1, RoomType.DOUBLE, true));
		}

		for (int i = 20; i < 25; i++) {
			service.addRoom(new Room(i + 1, RoomType.SUITE, true));
		}
	}

	public String reserveRoomForGuest(RoomType rt) {
		List<Room> r = service.search(rt);
		if (r.size() > 0) {
			service.reserve(r.get(0).getRoomNo());
			return "success";
		}
		return "failure";

	}

	public void displayAvailableRooms() {
		System.out.println(
				RoomType.SINGLE.toString() + " " + service.search(RoomType.SINGLE).stream().map(Room::getRoomNo).collect(Collectors.toList()));
		System.out.println(
				RoomType.DOUBLE.toString() + " " + service.search(RoomType.DOUBLE).stream().map(Room::getRoomNo).collect(Collectors.toList()));
		System.out.println(
				RoomType.SUITE.toString() + " " + service.search(RoomType.SUITE).stream().map(Room::getRoomNo).collect(Collectors.toList()));

	}

}
