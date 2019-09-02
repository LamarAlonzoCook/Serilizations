package com.lamars.series;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MainDriver3 {

	public static void main(String[] args) {
	String filename = "./Cook4HiretoHire.txt";
	//create object
	Cooks cook = new Cooks("Lamar Cook", 39," University of Phoenix",true, true, 7);
	Cooks cook1 = new Cooks("Micaiah Cook", 11," University of RoBlox",true, true, 4);
	Cooks cook2 = new Cooks("Shaun Cook", 13," University of RoBlox",true, true, 3);
	Cooks cook3 = new Cooks("Lamar Cook Jr.", 16," University of Wayne",true, true, 7);
	Cooks cook4 = new Cooks("Amarion Cook", 6," University of FirstGrage",true, true, 1);
	Cooks cook5 = new Cooks("Lailah Cook", 3," University of Poop",true, true, 3);
	Cooks cook6 = new Cooks("Shantae Cook", 38," University of Indy",true, true, 7);
	Cooks cook7 = new Cooks("Lamonte Cook", 49," University of Car Dealership",true, true, 7);
	Cooks cook8 = new Cooks("Blanket Cook", 9," University of Phoenix",true, false, 7);
	Cooks cook9 = new Cooks("Worst Cook", 100," University of America",false, true, 7);
	
	readObject(filename);
	//writeObject(filename, cook, cook1,cook2,cook3,cook4,cook5,cook6,cook7,cook8,cook9);

	}

	private static void readObject(String filename) {
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))){
			
			try {
			
			
			Object obj0 = ois.readObject();
			Object obj1 = ois.readObject();
			Object obj2 = ois.readObject();
			Object obj3 = ois.readObject();
			Object obj4 = ois.readObject();
			Object obj5 = ois.readObject();
			Object obj6 = ois.readObject();
			Object obj7 = ois.readObject();
			Object obj8 = ois.readObject();
			Object obj9 = ois.readObject();
			System.out.println(obj0);
			System.out.println(obj1);
			System.out.println(obj2);
			System.out.println(obj3);
			System.out.println(obj4);
			System.out.println(obj5);
			System.out.println(obj6);
			System.out.println(obj7);
			System.out.println(obj8);
			System.out.println(obj9);
			
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
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

	private static void writeObject(String filename, Object obj, Object obj1, Object obj2,
			Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
	try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))){
		oos.writeObject(obj);
		oos.writeObject(obj1);
		oos.writeObject(obj2);
		oos.writeObject(obj3);
		oos.writeObject(obj4);
		oos.writeObject(obj5);
		oos.writeObject(obj6);
		oos.writeObject(obj7);
		oos.writeObject(obj8);
		oos.writeObject(obj9);
		
		
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}
}

