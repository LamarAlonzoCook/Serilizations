package com.lamars.series;

import java.io.Serializable;

public class Cooks implements Serializable {
private static final long serialVersionUID = 1122334455667788990L;

private String name;
private int age;
private String nameOfCollege;
private boolean degree;
private boolean certifications;
private int yearsOfExperience;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getNameOfCollege() {
	return nameOfCollege;
}
public void setNameOfCollege(String nameOfCollege) {
	this.nameOfCollege = nameOfCollege;
}
public boolean isDegree() {
	return degree;
}
public void setDegree(boolean degree) {
	this.degree = degree;
}
public boolean isCertifications() {
	return certifications;
}
public void setCertifications(boolean certifications) {
	this.certifications = certifications;
}
public int getYearsOfExperience() {
	return yearsOfExperience;
}
public void setYearsOfExperience(int yearsOfExperience) {
	this.yearsOfExperience = yearsOfExperience;
}
@Override
public String toString() {
	return "Cooks [name=" + name + ", age=" + age + ", nameOfCollege=" + nameOfCollege + ", degree=" + degree
			+ ", certifications=" + certifications + ", yearsOfExperience=" + yearsOfExperience + "]";
}
public Cooks(String name, int age, String nameOfCollege, boolean degree, boolean certifications,
		int yearsOfExperience) {
	super();
	this.name = name;
	this.age = age;
	this.nameOfCollege = nameOfCollege;
	this.degree = degree;
	this.certifications = certifications;
	this.yearsOfExperience = yearsOfExperience;
}


}
