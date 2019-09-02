package com.lamars.series;

import java.io.Serializable;

public class Babies implements Serializable {

	private static final long serialVersionUID = 344454647484L;
	
	private String name;
	private String nickName;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Babies [name=" + name + ", nickName=" + nickName + ", age=" + age + "]";
	}
	public Babies(String name, String nickName, int age) {
		super();
		this.name = name;
		this.nickName = nickName;
		this.age = age;
	}
	
	
}
