package com.app.dao;

import java.util.List;

import com.app.model.Employee;

public interface IEmployeeDao {


	public Employee findeEmployeeById(int id);

	public void saveEmployee(Employee employee);

	public void updateEmployee(Employee employee);

	public void deleteEmployee(int id);
	
	public List<Employee> getAllEmployees();
	

}
