package com.app.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeRowMapper implements RowMapper<Employee> {

		 @Override
		 public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		  Employee employee = new Employee();
		  employee.setEmpId(rs.getInt("emp_id"));
		  employee.setEmpName(rs.getString("emp_name"));
		  employee.setEmpAddrs(rs.getString("emp_addrs"));
		  employee.setEmpRole(rs.getString("emp_role"));
		  return employee;
		 }

}
