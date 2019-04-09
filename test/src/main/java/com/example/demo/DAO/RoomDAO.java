package com.example.demo.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.DAO.Mapper.RoomMapper;
import com.example.demo.Entity.Room;

@Repository
public class RoomDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	String sql = "select * from mydb.rooms";
	String sqlAdd = "insert into mydb.rooms (roomNumber, numberOfSeats, numberIsEmpty, price, Clients_idClient, RoomClass_roomClass) values (?,?,?,?,?,?)";

	public List<Room> getAllRooms() {
		List<Room> rooms = jdbcTemplate.query(sql, new RoomMapper());
		
		return rooms;
	}
	
	public List<Room> getRooms(int numberOfSeats, String roomClass_RoomClass) {
		String sqlGet = "select * from mydb.rooms where numberOfSeats=? and RoomClass_roomClass=?";
		List<Room> rooms = jdbcTemplate.query(sqlGet, new Object[] {numberOfSeats, roomClass_roomClass}, new RoomMapper());
		
		return rooms;
	}
	
	public void addRoom(Room room) {
		
		jdbcTemplate.update(sqlAdd, room.getRoomNumber(), 
									room.getNumberOfSeats(), 
									room.isNumberIsEmpty(), 
									room.getPrice(), 
									room.getClients_idClient(), 
									room.getRoomClass_roomClass());
		
	}
	
	public void removeRoom() {
		
	}
	
	public Room getRoomByIdClient() {
		return null;
	}

    public Room getByRoomNumber(int roomNumber) {
  
        return null;
    }
}

