package com.lamars.series;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MainDriver5 {

	public static void main(String[] args) {
		
		String filename = "./WeatherMan.txt";
		Storms TStorm = new Storms(3,60,12.3,4);
		
		readObject(filename);
	//	writeObject(filename, TStorm);

	}

	
	private static void writeObject(String filename, Storms tStorm) {
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))){
			oos.writeObject(tStorm);
			
			
			
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
        	  Storms TStorm = (Storms) ois.readObject();
        	  System.out.println(TStorm);
        	  
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
