package com.example.demo.Entity;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	private int idEmployee;
    private String name;
    private String surname;
    private String patronymic;
    private int idAccount;
	
    public Employee() {
		super();
	}

	public Employee(String name, String surname, String patronymic) {
		super();
		this.name = name;
		this.surname = surname;
		this.patronymic = patronymic;
		idAccount = 0;
	}
	
	

	public Employee(String name, String surname, String patronymic, int idAccount) {
		super();
		this.name = name;
		this.surname = surname;
		this.patronymic = patronymic;
		this.idAccount = idAccount;
	}

	public Employee(int idEmployee, String name, String surname, String patronymic, int idAccount) {
		super();
		this.idEmployee = idEmployee;
		this.name = name;
		this.surname = surname;
		this.patronymic = patronymic;
		this.idAccount = idAccount;
	}

	public int getIdEmployee() {
		return idEmployee;
	}

	public void setIdEmployee(int idEmployee) {
		this.idEmployee = idEmployee;
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

	public int getIdAccount() {
		return idAccount;
	}

	public void setIdAccount(int idAccount) {
		this.idAccount = idAccount;
	}

    
}
