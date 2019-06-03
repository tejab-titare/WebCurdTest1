package com.app.service;

import java.util.List;

import com.app.model.Employee;

public interface IEmployeeService {
	
//abstarct method 
	public Employee findeEmployeeById(int id);

	public void saveEmployee(Employee employee);

	public void updateEmployee(Employee employee);

	public void deleteEmployee(int id);
	
	public List<Employee> getAllEmployees();
	

}
