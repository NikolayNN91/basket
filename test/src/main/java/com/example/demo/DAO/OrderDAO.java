package com.example.demo.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Order;

@Repository
public class OrderDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	String sqlAdd = "insert into mydb.order (roomClass, "
			+ "numberOfSeats, dateOfarrival, countOfDay, Client_idClient) values (?, ?, ?, ?, ?)";
	
	public void addOrder(Order order) {
		jdbcTemplate.update(sqlAdd, order.getRoomClass(), 
									order.getNumberOfSeats(),
									order.getDateOfArrival(), 
									order.getCountOfDay(), 
									order.getClient_idClient());
			
	}
		
	public void removeOrder() {
			
	}
		
	public Order getOrderByIdClient() {
		return null;
	}

}
