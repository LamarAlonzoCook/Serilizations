package com.lamars.series;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MainDriver4 {

	public static void main(String[] args) {
		
		String filename = "./TheTerroristGroups.txt";
		TerroristOrgs terror = new TerroristOrgs("Bin Laden","Iran", 10, true);
		
		readObject(filename);
		writeObject(filename, terror);

	}

	private static void writeObject(String filename, TerroristOrgs terror) {
	      try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))){
	    	  oos.writeObject(terror);
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
		
		TerroristOrgs terror = (TerroristOrgs) ois.readObject();
		System.out.println(terror);
		
		
		
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
