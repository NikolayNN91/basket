package com.example.demo.Entity;

import java.sql.Date;

import org.springframework.stereotype.Component;

@Component
public class Order {
	private int idOrder;
	private String roomClass;
	private int numberOfSeats;
	private Date dateOfArrival;
	private int countOfDay;
	private int client_idClient;
	
	
	public Order() {
		super();
	}

	public Order(String roomClass, int numberOfSeats, Date dateOfArrival, int countOfDay, int client_idClient) {
		super();
		this.roomClass = roomClass;
		this.numberOfSeats = numberOfSeats;
		this.dateOfArrival = dateOfArrival;
		this.countOfDay = countOfDay;
		this.client_idClient = client_idClient;
	}

	public Order(int idOrder, String roomClass, int numberOfSeats, Date dateOfArrival, int countOfDay,
			int client_idClient) {
		super();
		this.idOrder = idOrder;
		this.roomClass = roomClass;
		this.numberOfSeats = numberOfSeats;
		this.dateOfArrival = dateOfArrival;
		this.countOfDay = countOfDay;
		this.client_idClient = client_idClient;
	}
	
	public int getIdOrder() {
		return idOrder;
	}
	public void setIdOrder(int idOrder) {
		this.idOrder = idOrder;
	}
	public String getRoomClass() {
		return roomClass;
	}
	public void setRoomClass(String roomClass) {
		this.roomClass = roomClass;
	}
	public int getNumberOfSeats() {
		return numberOfSeats;
	}
	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}
	public Date getDateOfArrival() {
		return dateOfArrival;
	}
	public void setDateOfArrival(Date dateOfArrival) {
		this.dateOfArrival = dateOfArrival;
	}
	public int getCountOfDay() {
		return countOfDay;
	}
	public void setCountOfDay(int countOfDay) {
		this.countOfDay = countOfDay;
	}
	public int getClient_idClient() {
		return client_idClient;
	}
	public void setClient_idClient(int client_idClient) {
		client_idClient = client_idClient;
	}
	
}

