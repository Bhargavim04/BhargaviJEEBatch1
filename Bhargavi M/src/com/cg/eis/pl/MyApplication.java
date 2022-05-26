package com.cg.eis.pl;

import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeServiceImpl;

public class MyApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeServiceImpl empService = new EmployeeServiceImpl();
		System.out.println("Choose any one option below");
		System.out.println("1. Add Employee");
		System.out.println("2. Find Insurance Scheme");
		System.out.println("3. Get Employee details");

		int i = sc.nextInt();
		switch (i) {

		case 1:
			System.out.println("Enter emp id: ");
			int id = sc.nextInt();
			System.out.println("Enter emp name: ");
			String empName = sc.next();
			System.out.println("Enter emp salary: ");
			double salary = sc.nextDouble();
			System.out.println("Enter emp designation");
			String designation = sc.next();

			// Create Employee Obj
			Employee emp = new Employee();
			emp.setEmpId(id);
			emp.setEmpName(empName);
			emp.setEmpDestination(designation);
			emp.setEmpSalary(salary);

			if (salary > 5000 || salary < 20000 && designation == "System Associate") {
				emp.setEmpInsuranceScheme("SCHEME C");
			} else if (salary >= 20000 || salary < 40000 && designation == "Programmer") {
				emp.setEmpInsuranceScheme("SCHEME B");
			} else if (salary >= 40000 && designation == "Manager") {
				emp.setEmpInsuranceScheme("Scheme A");
			} else if (salary < 5000 && designation == "Clerk") {
				emp.setEmpInsuranceScheme("No SCHEME");
			}

			Employee newEmp = empService.addEmployee(emp);
			System.out.println(newEmp);

			break;
		case 2:
			
			break;
		case 3:
			
			break;
		default:
			System.out.println("Enter any value between 1 and 3");

		}

	}

}
