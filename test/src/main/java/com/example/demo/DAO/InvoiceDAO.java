package com.example.demo.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Invoice;

@Repository
public class InvoiceDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	String sql = "insert into mydb.invoice (amount, data, Clients_idClient) values (?, ?, ?)";
	
	public void addInvoice(Invoice invoice) {
		
		jdbcTemplate.update(sql, invoice.getAmount(), 
								invoice.getDate(), 
								invoice.getClients_idClient());
		
	}
	
	public void removeInvoice() {
		
	}
	
	public Invoice getInvoiceByIdClient() {
		return null;
	}

}
