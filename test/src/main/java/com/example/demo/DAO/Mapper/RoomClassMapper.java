package com.example.demo.DAO.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.demo.Entity.RoomClass;

public class RoomClassMapper implements RowMapper<RoomClass>{
	
	@Override
	public RoomClass mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		RoomClass roomClass = new RoomClass();
		
		roomClass.setRoomClass(rs.getString("roomClass"));
		
		return roomClass; 
	}

}
