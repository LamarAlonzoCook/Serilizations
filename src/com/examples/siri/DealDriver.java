package com.examples.siri;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class DealDriver {

	public static void main(String[] args) {
	//	NoDeal theDeal = new NoDeal(null, 0, false);
		Deal dill = new Deal("Lamar","MegaMills",true);
		String filename = "./DeallyDeal.txt";
		
		readObject(filename);
	//	writeObject(filename, dill);

	}
private static void writeObject(String filename, Object obj) {
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))){
			oos.writeObject(obj);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
private static void readObject(String filename) {
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))){
			Object obj = ois.readObject();
			System.out.println(obj);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
public class NoDeal implements Serializable{
	
	private static final long serialVersionUID = 2233448877L;
	
	String name;
	int age;
	boolean deal;
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
	public boolean isDeal() {
		return deal;
	}
	public void setDeal(boolean deal) {
		this.deal = deal;
	}
	@Override
	public String toString() {
		return "NoDeal [name=" + name + ", age=" + age + ", deal=" + deal + "]";
	}
	public NoDeal(String name, int age, boolean deal) {
		super();
		this.name = name;
		this.age = age;
		this.deal = deal;
	}
	
}
}
