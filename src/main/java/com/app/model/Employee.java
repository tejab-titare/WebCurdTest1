package com.app.model;

public class Employee {
	
	private Integer empId;
	private String empName;
	private String empAddrs;
	private String empRole;
	
	public Employee() {
		super();
	}

	public Employee(Integer empId, String empName, String empAddrs, String empRole) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAddrs = empAddrs;
		this.empRole = empRole;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpAddrs() {
		return empAddrs;
	}

	public void setEmpAddrs(String empAddrs) {
		this.empAddrs = empAddrs;
	}

	public String getEmpRole() {
		return empRole;
	}

	public void setEmpRole(String empRole) {
		this.empRole = empRole;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAddrs=" + empAddrs + ", empRole=" + empRole
				+ "]";
	}
	
	

}
