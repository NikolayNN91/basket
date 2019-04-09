package com.example.demo.Entity;

import org.springframework.stereotype.Component;

@Component
public class Room {
	private int roomNumber;
	private int numberOfSeats;
	private boolean numberIsEmpty;
	private int price;
	private int clients_idClient;
	private String roomClass_roomClass;
	
	
	public Room() {
		super();
	}

	public Room(int roomNumber, int numberOfSeats, boolean numberIsEmpty, int price, String roomClass_roomClass) {
		super();
		this.roomNumber = roomNumber;
		this.numberOfSeats = numberOfSeats;
		this.numberIsEmpty = numberIsEmpty;
		this.price = price;
		this.clients_idClient = 0;
		this.roomClass_roomClass = roomClass_roomClass;
	}

	public Room(int roomNumber, int numberOfSeats, boolean numberIsEmpty, int price, int clients_idClient,
			String roomClass_roomClass) {
		super();
		this.roomNumber = roomNumber;
		this.numberOfSeats = numberOfSeats;
		this.numberIsEmpty = numberIsEmpty;
		this.price = price;
		this.clients_idClient = clients_idClient;
		this.roomClass_roomClass = roomClass_roomClass;
	}


	public int getRoomNumber() {
		return roomNumber;
	}


	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}


	public int getNumberOfSeats() {
		return numberOfSeats;
	}


	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}


	public boolean isNumberIsEmpty() {
		return numberIsEmpty;
	}


	public void setNumberIsEmpty(boolean numberIsEmpty) {
		this.numberIsEmpty = numberIsEmpty;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public int getClients_idClient() {
		return clients_idClient;
	}


	public void setClients_idClient(int clients_idClient) {
		this.clients_idClient = clients_idClient;
	}


	public String getRoomClass_roomClass() {
		return roomClass_roomClass;
	}


	public void setRoomClass_roomClass(String roomClass_roomClass) {
		this.roomClass_roomClass = roomClass_roomClass;
	}

	 

}
