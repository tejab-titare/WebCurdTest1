package com.app.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.app.model.Employee;
import com.app.model.EmployeeRowMapper;



//DAO CLASS 
@Transactional //for rollback tx management
@Repository
public class EmployeeDaoImpl implements IEmployeeDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;//Has-a

	// SELECT DATA base on ID
	@Override
	public Employee findeEmployeeById(int id) {
		String query = "SELECT * FROM employees WHERE emp_id = ?";
		RowMapper<Employee> rowMapper = new BeanPropertyRowMapper<Employee>(Employee.class);
		Employee employee = jdbcTemplate.queryForObject(query, rowMapper, id);

		return employee;
	}
	//Insert Data
	@Override
	public void saveEmployee(Employee employee) {
		String query = "INSERT INTO employees(emp_id, emp_name, emp_addrs, emp_role) VALUES(?, ?, ?, ?)";
		jdbcTemplate.update(query, employee.getEmpId(),
				employee.getEmpName(), employee.getEmpAddrs(), employee.getEmpRole()
				);

	}
	//UPDATE DATA
	@Override
	public void updateEmployee(Employee employee) {
		String query = "UPDATE employees SET  emp_name=?, emp_addrs=?, emp_role=?"
				+ "WHERE emp_id="+employee.getEmpId();
			
		jdbcTemplate.update(query,
				employee.getEmpName(), employee.getEmpAddrs(), employee.getEmpRole()
				);


	}
	//DELETE DATA
	@Override
	public void deleteEmployee(int id) {
		String query = "DELETE FROM employees WHERE emp_id=?";
		jdbcTemplate.update(query, id);
	}
	//VEIW ALL DATA
	@Override
	public List<Employee> getAllEmployees() {
		String query = "SELECT * from employees";
		RowMapper<Employee> rowMapper = new EmployeeRowMapper();
		List<Employee> list = jdbcTemplate.query(query, rowMapper);

		return list;
	}

}//class