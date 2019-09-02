package com.lamars.series;

import java.io.Serializable;

public class Scientist implements Serializable {
	private static final long serialVersionUID = 7788664455336629817L;
	
	private boolean degree;
	private String name;
	private int age;
	private String programmingLang;
	private boolean qualified;
	public boolean isDegree() {
		return degree;
	}
	public void setDegree(boolean degree) {
		this.degree = degree;
	}
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
	public String getProgrammingLang() {
		return programmingLang;
	}
	public void setProgrammingLang(String programmingLang) {
		this.programmingLang = programmingLang;
	}
	public boolean isQualified() {
		return qualified;
	}
	public void setQualified(boolean qualified) {
		this.qualified = qualified;
	}
	@Override
	public String toString() {
		return "Scientist [degree=" + degree + ", name=" + name + ", age=" + age + ", programmingLang="
				+ programmingLang + ", qualified=" + qualified + "]";
	}
	public Scientist(boolean degree, String name, int age, String programmingLang, boolean qualified) {
		super();
		this.degree = degree;
		this.name = name;
		this.age = age;
		this.programmingLang = programmingLang;
		this.qualified = qualified;
	}
	

}
