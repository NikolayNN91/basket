package com.example.demo.DAO.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.demo.Entity.Customer;

public class CustomerMapper implements RowMapper<Customer> {
	
	@Override
	public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
	
	Customer customer = new Customer();
	
	customer.setIdClient(rs.getInt("idClient"));
	customer.setName(rs.getString("name"));
	customer.setSurname(rs.getString("surname"));
	customer.setPatronymic(rs.getString("patronymic"));
	customer.setBirthday(rs.getDate("birthday"));
	customer.setIdAccount(rs.getInt("Account_idAccount"));
	
	return customer;
	}
	
	

}
