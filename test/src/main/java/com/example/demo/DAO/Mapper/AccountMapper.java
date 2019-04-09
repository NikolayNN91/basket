package com.example.demo.DAO.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.demo.Entity.Account;

public class AccountMapper implements RowMapper<Account> {
	
	@Override
	public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Account account = new Account();
		
		account.setIdAccount(rs.getInt("idAccount"));
		account.setLogin(rs.getString("login"));
		account.setPassword(rs.getString("password"));
		account.setAdmin(rs.getInt("isAdmin"));
		
		return account; 
	}

}
