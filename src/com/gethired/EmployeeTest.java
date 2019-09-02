package com.gethired;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp = new Employee("lamar", "frontend Development", "August");
		
		String filename = "./Hired.txt";
		readObject(filename);
	//	writeObject(filename, emp);
	}

	private static void readObject(String filename) {
try {
	ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename));
	try {
		Employee emp = (Employee) ois.readObject();
		System.out.println(emp);
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}		
	}

	private static void writeObject(String filename, Employee emp) {
		// TODO Auto-generated method stub
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename));
			oos.writeObject(emp);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
