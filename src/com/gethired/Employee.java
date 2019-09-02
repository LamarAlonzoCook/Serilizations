package com.gethired;

import java.io.Serializable;

public class Employee implements Serializable {
private static final long serialVersionUID = 2237337L;

private String name;
private String Department;
private String MonthHired;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDepartment() {
	return Department;
}
public void setDepartment(String department) {
	Department = department;
}
public String getMonthHired() {
	return MonthHired;
}
public void setMonthHired(String monthHired) {
	MonthHired = monthHired;
}
@Override
public String toString() {
	return "Employee [name=" + name + ", Department=" + Department + ", MonthHired=" + MonthHired + "]";
}
public Employee(String name, String department, String monthHired) {
	
	this.name = name;
	this.Department = department;
	this.MonthHired = monthHired;
}

}
