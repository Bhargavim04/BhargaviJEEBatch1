package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public class EmployeeServiceImpl implements IEmployeeService {
	
	Employee[] employees = new Employee[10];
	int index=0;

	@Override
	public Employee addEmployee(Employee emp) {
		employees[index]=emp;
		index++;
		
		return emp;
	}

	@Override
	public String getInsuranceScheme(double salary, String designation) {
		
		return null;
	}

	@Override
	public Employee getEmployee(int empId) {
		
		return null;
	}

}
