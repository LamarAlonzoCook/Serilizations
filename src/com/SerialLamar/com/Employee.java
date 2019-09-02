package com.SerialLamar.com;

import java.io.Serializable;

public class Employee implements Serializable {

	private static final long serialVersionUID = 7337373981L;
	
	private String name;
	private int empID;
	private double payRate;
	private String dept;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public double getPayRate() {
		return payRate;
	}
	public void setPayRate(double payRate) {
		this.payRate = payRate;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", empID=" + empID + ", payRate=" + payRate + ", dept=" + dept + "]";
	}
	public Employee(String name, int empID, double payRate, String dept) {
		super();
		this.name = name;
		this.empID = empID;
		this.payRate = payRate;
		this.dept = dept;
	}
	
	
}
