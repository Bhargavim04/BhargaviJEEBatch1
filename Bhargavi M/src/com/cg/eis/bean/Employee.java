package com.cg.eis.bean;

public class Employee {

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", empDestination="
				+ empDestination + ", empInsuranceScheme=" + empInsuranceScheme + "]";
	}
	private int empId;
	private String empName;
	private double empSalary;
	private String empDestination;
	private String empInsuranceScheme;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public String getEmpDestination() {
		return empDestination;
	}
	public void setEmpDestination(String empDestination) {
		this.empDestination = empDestination;
	}
	public String getEmpInsuranceScheme() {
		return empInsuranceScheme;
	}
	public void setEmpInsuranceScheme(String empInsuranceScheme) {
		this.empInsuranceScheme = empInsuranceScheme;
	}
	

}
