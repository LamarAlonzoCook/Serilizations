package com.lamars.series;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MainDrvier {

	public static void main(String[] args) {
		String filename = "./Cereal.txt";
		ManMan man = new ManMan(true, "Black","Toot", 39);
		
		readObject(filename);
	//	writeObject(filename, man);
	
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

}
