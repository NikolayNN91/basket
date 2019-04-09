package com.example.demo.Entity;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

@Component
public class Account {
	
	private int idAccount;
	@NotEmpty(message="Поле \"Логин\" должно быть заполнено.")
	@Size(min=3, max=30, message="Логин должен быть длиной 3-30 символов.")
	private String login;
	@NotEmpty(message="Поле \"Пароль\" должно быть заполнено.")
	@Size(min=3, max=30, message="Пароль должен быть длиной 3-30 символов.")
	private String password;
	private int isAdmin;
	
	public Account() {
		super();
	}

	public Account(int idAccount, String login, String password, int isAdmin) {
		super();
		this.idAccount = idAccount;
		this.login = login;
		this.password = password;
		this.isAdmin = isAdmin;
	}
	
	

	public Account(String login, String password, int isAdmin) {
		super();
		this.login = login;
		this.password = password;
		this.isAdmin = isAdmin;
	}

	public int getIdAccount() {
		return idAccount;
	}

	public void setIdAccount(int idAccount) {
		this.idAccount = idAccount;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int isAdmin() {
		return isAdmin;
	}

	public void setAdmin(int isAdmin) {
		this.isAdmin = isAdmin;
	}
	
	
	    
}
