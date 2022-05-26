package com.cg.eis.exception;

import java.util.Scanner;

public class L5E3EmpSalary {

	public static void main(String[] args) throws EmployeeException {
		
		System.out.println("Enter the Employee Salary");
		Scanner scan= new Scanner(System.in);
		int sal=scan.nextInt();
		if(sal<3000) {
			throw new EmployeeException("Salary is less that 3000");
		}else {
			System.out.println("Salary is acceptible");
		}

	}

}
