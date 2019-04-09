package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.Entity.Account;
import com.example.demo.Entity.Customer;
import com.example.demo.DAO.AccountDAO;
import com.example.demo.DAO.CustomerDAO;
import com.example.demo.Interface.ServiceInterface;

@Component
public class Service implements ServiceInterface {
	
	@Autowired
	private AccountDAO accountDAO;
	
	@Autowired
	private CustomerDAO customerDAO;
	
	@Override
	public void addUser(Account account, Customer customer) {
		accountDAO.addAccount(account);
		customer.setIdAccount(accountDAO.getAccountByLogin(account.getLogin()).getIdAccount());
		customerDAO.addCustomer(customer);

	}
	
	public String getUserNameByAccount(Account account) {
		
		return customerDAO.getCustomerByIdAccount(account.getIdAccount()).getName();

	}
		
}
