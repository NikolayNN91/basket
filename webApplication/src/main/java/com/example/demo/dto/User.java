package com.example.demo.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User {
	
	@Size(min=1, max=30, message="Имя должно быть длиной 3-30 символов")
	String name;
	
	@NotNull
	@Size(min=3, max=30, message="Логин должен быть длиной 3-30 символов")
	String login;
	
	@Size(min=3, max=30, message="Пароль должен быть длиной 3-30 символов")
	String password;
	
	public User(String name, String login, String password) {
		super();
		this.name = name;
		this.login = login;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
	
	
	

}
