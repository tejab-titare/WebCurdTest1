package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.EmployeeDaoImpl;
import com.app.model.Employee;

//SERVICE CLASS BUSNESS LOGIC
@Service
public class EmployeeServiceImpl implements IEmployeeService {

	//	 Has-a 
	@Autowired
	private EmployeeDaoImpl empdao;

	@Override
	public Employee findeEmployeeById(int id) {
		return empdao.findeEmployeeById(id);
	}

	@Override
	public void saveEmployee(Employee employee) {
		empdao.saveEmployee(employee);

	}

	@Override
	public void updateEmployee(Employee employee) {
		empdao.updateEmployee(employee);		
	}

	@Override
	public void deleteEmployee(int id) {
		empdao.deleteEmployee(id);
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return empdao.getAllEmployees();
	}

}
