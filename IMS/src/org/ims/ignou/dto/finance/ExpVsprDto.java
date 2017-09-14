package org.ims.ignou.dto.finance;

public class ExpVsprDto {

	double employeeSalary;
	double studentFees;
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	public double getStudentFees() {
		return studentFees;
	}
	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public void setStudentFees(double studentFees) {
		this.studentFees = studentFees;
	}
	@Override
	public String toString() {
		return "ExpVsprDto [employeeSalary=" + employeeSalary + ", studentFees=" + studentFees + "]";
	}
	
	
	
	
}
