package com.MoreSerialization;

import java.io.Serializable;

public class Employee implements Serializable {

	private static final long serialVersionUID = 4991212L;
	
	String name;
	String password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", password=" + password + "]";
	}
	public Employee(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	
}
