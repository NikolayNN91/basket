package com.example.demo.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.DAO.Mapper.RoomClassMapper;
import com.example.demo.Entity.RoomClass;

@Repository
public class RoomClassDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	String sql = "select * from mydb.roomclass";
	String sqlGet = "select * from mydb.roomclass where roomClass=?";
	String sqlAdd= "INSERT INTO mydb.roomclass (roomClass) VALUES (?)";
	
	public List<RoomClass> getAllRoomClass() {
		List<RoomClass> roomClass = jdbcTemplate.query(sql, new RoomClassMapper());

		return roomClass;
	}
	
	public void addAccount(RoomClass roomClass) {
		
		jdbcTemplate.update(sqlAdd,	roomClass.getRoomClass());
	}
	
	public String getRoomClass(String roomClass) {
		RoomClass rc = jdbcTemplate.queryForObject(sqlGet, new Object[] {roomClass}, new RoomClassMapper());
		return rc.getRoomClass();
	}
}
