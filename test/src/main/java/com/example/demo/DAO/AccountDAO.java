package com.example.demo.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.DAO.Mapper.AccountMapper;
import com.example.demo.Entity.Account;

@Repository
public class AccountDAO {
	    
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	String sql= "SELECT * FROM mydb.account";
	String sqlAdd= "INSERT INTO mydb.account (login, password, isAdmin) VALUES (?, ?, ?)";
	String sqlGet= "SELECT * FROM mydb.account where login=?";
	
	public List<Account> getAllAccounts() {
		List<Account> accounts = jdbcTemplate.query(sql, new AccountMapper());

		return accounts;
	}

	public void addAccount(Account account) {
		
		jdbcTemplate.update(sqlAdd,	account.getLogin(), 
									account.getPassword(), 
									account.isAdmin());
	}

	public void removeAccount() {
	        
	}

	public Account getAccountByLogin(String login) {
		Account account = jdbcTemplate.queryForObject(sqlGet, new Object[] {login}, new AccountMapper());
		return account;
	}
}
