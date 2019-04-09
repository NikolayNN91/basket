package com.example.demo.DAO.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.demo.Entity.Employee;

public class EmployeeMapper implements RowMapper<Employee> {
	
	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
	
		Employee employee = new Employee();
	
		employee.setIdEmployee(rs.getInt("idEmployee"));
		employee.setName(rs.getString("name"));
		employee.setSurname(rs.getString("surname"));
		employee.setPatronymic(rs.getString("patronymic"));
		employee.setIdAccount(rs.getInt("Account_idAccount"));
	
		return employee;
	}
	
	

}
