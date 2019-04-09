package com.example.demo.DAO.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.demo.Entity.Order;

public class OrderMapper implements RowMapper<Order> {
	
	@Override
	public Order mapRow(ResultSet rs, int rowNum) throws SQLException {
		Order order = new Order();
		
		order.setIdOrder(rs.getInt("idOrder"));
		order.setRoomClass(rs.getString("roomClass"));
		order.setNumberOfSeats(rs.getInt("numberOfSeats"));
		order.setDateOfArrival(rs.getDate("dateOfArrival"));
		order.setCountOfDay(rs.getInt("countOfDay"));
		order.setClient_idClient(rs.getInt("Client_idClient"));
		
		return order;
	}

}
