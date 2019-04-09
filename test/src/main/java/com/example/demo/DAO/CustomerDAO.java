package com.example.demo.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Customer;
import com.example.demo.DAO.Mapper.CustomerMapper;

@Repository
public class CustomerDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	String sql = "select * from mydb.clients";
	String sqlAdd = "insert into mydb.clients (name, surname, patronymic, birthday, Account_idAccount) values (?,?,?,?,?)";
	String sqlGet = "select * from mydb.clients where Account_idAccount=?";

	public List<Customer> getAllCustomers() {
		List<Customer> customers = jdbcTemplate.query(sql, new CustomerMapper());
		
		return customers;
	}
	
	public void addCustomer(Customer customer) {
		
		jdbcTemplate.update(sqlAdd, customer.getName(), 
									customer.getSurname(),
									customer.getPatronymic(), 
									customer.getBirthday(),
									customer.getIdAccount());
	}
	
	public void removeClient() {
		
	}
	
	public Customer getCustomerByIdAccount(int account_idAccount) {
		Customer customer = jdbcTemplate.queryForObject(sqlGet, new Object[] {account_idAccount}, new CustomerMapper());
		return customer;

	}

}
