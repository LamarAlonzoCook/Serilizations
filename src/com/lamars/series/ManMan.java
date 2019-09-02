package com.lamars.series;

import java.io.Serializable;

public class ManMan implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2827374647585958574L;
	
	private boolean heart;
	private String color;
	private String name;
	private int age;
	public boolean isHeart() {
		return heart;
	}
	public void setHeart(boolean heart) {
		this.heart = heart;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
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
	@Override
	public String toString() {
		return "ManMan [heart=" + heart + ", color=" + color + ", name=" + name + ", age=" + age + "]";
	}
	public ManMan(boolean heart, String color, String name, int age) {
		super();
		this.heart = heart;
		this.color = color;
		this.name = name;
		this.age = age;
	}
	
}
