package com.example.demo.Entity;

import org.springframework.stereotype.Component;

@Component
public class RoomClass {
	
	private String roomClass;

	public RoomClass() {
		super();
	}

	public RoomClass(String roomClass) {
		super();
		this.roomClass = roomClass;
	}

	public String getRoomClass() {
		return roomClass;
	}

	public void setRoomClass(String roomClass) {
		this.roomClass = roomClass;
	}
	
	

}
