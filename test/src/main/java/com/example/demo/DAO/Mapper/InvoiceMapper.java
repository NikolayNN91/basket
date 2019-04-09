package com.example.demo.DAO.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.demo.Entity.Invoice;

public class InvoiceMapper implements RowMapper<Invoice> {
	
	@Override
	public Invoice mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Invoice invoice = new Invoice();
		
		invoice.setInvoiceNumber(rs.getInt("invoiceNumber"));
		invoice.setAmount(rs.getInt("amount"));
		invoice.setDate(rs.getDate("date"));
		invoice.setClients_idClient(rs.getInt("Clients_idClient"));
		
		return invoice;
	}

}
