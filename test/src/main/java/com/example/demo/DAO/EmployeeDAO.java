package com.example.demo.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Employee;
import com.example.demo.DAO.Mapper.EmployeeMapper;

@Repository
public class EmployeeDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	String sql = "select * from mydb.employees";
	String sqlAdd = "insert into mydb.employees (name, surname, patronymic, Account_idAccount) values (?,?,?,?)";
	

	public List<Employee> getAllEmployee() {
		List<Employee> employees = jdbcTemplate.query(sql, new EmployeeMapper());
		
		return employees;
	}
	
	public void addEmployee(Employee employee) {
		
		jdbcTemplate.update(sqlAdd, employee.getName(), 
									employee.getSurname(),
									employee.getPatronymic(), 
									employee.getIdAccount());
	}
	
	public void removeEmployee() {
		
	}
	
	public Employee getEmployeeByIdEmployee() {
		return null;
	}

}
