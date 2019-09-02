package com.SerialLamar.com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestDriver {

	public static void main(String[] args) {

		String filename = "MyEmployees.txt";

		Employee emp = new Employee( "Poppy", 2244, 24.50, "FullStack");
		Employee emp1 = new Employee("Pop",   244,  24.50, "BackEnd");
		Employee emp2 = new Employee("Popy",  224,  24.50, "FrontEnd");
		Employee emp3 = new Employee("Pppy",  2344, 24.50, "Database Design");

		readObject(filename);
		// writeObject(filename, emp, emp1, emp2, emp3);

	}

	private static void writeObject(String filename, Employee emp, Employee emp1, Employee emp2, Employee emp3) {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
			oos.writeObject(emp);
			oos.writeObject(emp1);
			oos.writeObject(emp2);
			oos.writeObject(emp3);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void readObject(String filename) {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
			Employee emp = (Employee) ois.readObject();
			Employee emp1 = (Employee) ois.readObject();
			Employee emp2 = (Employee) ois.readObject();
			Employee emp3 = (Employee) ois.readObject();
			System.out.println(emp);
			System.out.println(emp1);
			System.out.println(emp2);
			System.out.println(emp3);

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

}
