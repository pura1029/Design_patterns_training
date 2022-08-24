package com.model;

public class Room {
	private int roomNo;
	private RoomType type;
	private boolean vacant;

	public int getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}

	public RoomType getType() {
		return type;
	}

	public void setType(RoomType type) {
		this.type = type;
	}

	public Room(int roomNo, RoomType type, boolean vacant) {
		super();
		this.roomNo = roomNo;
		this.type = type;
		this.vacant = vacant;
	}

	public boolean isVacant() {
		return vacant;
	}

	public void setVacant(boolean vacant) {
		this.vacant = vacant;
	}

	@Override
	public String toString() {
		return "Room [roomNo=" + roomNo + ", type=" + type + ", vacant=" + vacant + "]";
	}

}
