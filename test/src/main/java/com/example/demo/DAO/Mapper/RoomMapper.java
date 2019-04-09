package com.example.demo.DAO.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.demo.Entity.Room;

public class RoomMapper implements RowMapper<Room> {
	
	public Room mapRow(ResultSet rs, int rowNum) throws SQLException {
	
		Room room = new Room();
		
		room.setRoomNumber(rs.getInt("roomNumber"));
		room.setNumberOfSeats(rs.getInt("numberOfSeats"));
		room.setNumberIsEmpty(rs.getBoolean("numberIsEmpty"));
		room.setPrice(rs.getInt("price"));
		room.setClients_idClient(rs.getInt("clients_idClient"));
		room.setRoomClass_roomClass(rs.getString("roomClass_roomClass"));
		
		return room;
	
	}

}
