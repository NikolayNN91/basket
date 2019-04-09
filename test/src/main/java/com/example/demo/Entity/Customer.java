package com.example.demo.Entity;

import java.sql.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

@Component
public class Customer {
	private int idClient;
	@NotEmpty(message="Поле \"Имя\" должно быть заполнено.")
	@Size(min=2, max=30, message="Имя должно быть длиной 2-30 символов.")
	private String name;
	@NotEmpty(message="Поле \"Фамилия\" должно быть заполнено.")
	@Size(min=2, max=30, message="Фамилия должна быть длиной 2-30 символов.")
	private String surname;
	@NotEmpty(message="Поле \"Отчество\" должно быть заполнено.")
	@Size(min=2, max=30, message="Отчество должно быть длиной 2-30 символов.")
	private String patronymic;
	@NotEmpty(message="Поле с датой рождения должно быть заполнено.")
	private Date birthday;
	private int idAccount;
	

	public Customer() {

	}
	
	
	public Customer(int idClient, String name, String surname, String patronymic, Date birthday, int idAccount) {
		super();
		this.idClient = idClient;
		this.name = name;
		this.surname = surname;
		this.patronymic = patronymic;
		this.birthday = birthday;
		this.idAccount = idAccount;
	}
	
	public Customer(int idClient, String name, String surname, String patronymic, Date birthday) {
		super();
		this.idClient = idClient;
		this.name = name;
		this.surname = surname;
		this.patronymic = patronymic;
		this.birthday = birthday;
		this.idAccount = 0;
	}

	public Customer(String name, String surname, String patronymic, Date birthday) {
		super();
		this.name = name;
		this.surname = surname;
		this.patronymic = patronymic;
		this.birthday = birthday;
	}

	public int getIdClient() {
		return idClient;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}


	public String getPatronymic() {
		return patronymic;
	}


	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}


	public Date getBirthday() {
		return birthday;
	}


	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	public int getIdAccount() {
		return idAccount;
	}


	public void setIdAccount(int idAccount) {
		this.idAccount = idAccount;
	}


	@Override
	public String toString() {
		return "Customer [idClient=" + idClient + ", name=" + name + ", surname=" + surname + ", patronymic="
				+ patronymic + ", birthday=" + birthday + "]";
	}
	
	

}