package com.lamars.series;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MainDriver2 {

	public static void main(String[] args) {
		String filename = "./SciencePersonel.txt";

		// create an Object
		Scientist scieN = new Scientist(true, "Lamar", 39, "Java", true);
		Scientist scieN1 = new Scientist(false, "Alonzo", 40, "Java", true);
		Scientist scieN2 = new Scientist(true, "Chris", 24, "Java", true);
		Scientist scieN3 = new Scientist(true, "Amar", 35, "Java", true);
		Scientist scieN4 = new Scientist(true, "Taco", 34, "Java", true);

		readObject(filename);
		// writeObject(filename, scieN, scieN1, scieN2, scieN3, scieN4);

	}

	private static void writeObject(String filename, Object obj, Object obj1, Object obj2, Object obj3, Object obj4) {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
			oos.writeObject(obj);
			oos.writeObject(obj1);
			oos.writeObject(obj2);
			oos.writeObject(obj3);
			oos.writeObject(obj4);

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
			try {
				Object obj = ois.readObject();
				Object obj1 = ois.readObject();
				Object obj2 = ois.readObject();
				Object obj3 = ois.readObject();
				Object obj4 = ois.readObject();
				System.out.println(obj);
				System.out.println(obj1);
				System.out.println(obj2);
				System.out.println(obj3);
				System.out.println(obj4);
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

}
