package com.model;

import java.util.LinkedList;
import java.util.List;

public class HotelSearchService {
	
	private List<Room> rooms;
	
	public HotelSearchService() {
		rooms= new LinkedList<>();
	}
	public void addRoom(Room room) {
		rooms.add(room);
	}

	public List<Room> search(RoomType roomType){
		
		List<Room> searchList= new LinkedList<>();
		for(Room r:rooms)
			if(r.isVacant() && r.getType().equals(roomType))
				searchList.add(r);
		return searchList;
	}
	public void reserve(int roomno) {
		for(Room r: rooms) {
			if(r.getRoomNo() ==roomno) {
				r.setVacant(false);
				return;
			}
		}
	}

}
