package com.example.demo.Entity;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class Invoice {
	 private int invoiceNumber;
	 private int amount;
	 private Date date;
	 private int clients_idClient;
	
	 public Invoice() {
		super();
	}

	public Invoice(int amount, Date date, int clients_idClient) {
		super();
		this.amount = amount;
		this.date = date;
		this.clients_idClient = clients_idClient;
	}
	
	

	public Invoice(int invoiceNumber, int amount, Date date, int clients_idClient) {
		super();
		this.invoiceNumber = invoiceNumber;
		this.amount = amount;
		this.date = date;
		this.clients_idClient = clients_idClient;
	}

	public int getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(int invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getClients_idClient() {
		return clients_idClient;
	}

	public void setClients_idClient(int clients_idClient) {
		this.clients_idClient = clients_idClient;
	}
	 
	 

	 

}
