package com.rameshsoft.SerializableEx;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableDesirializableEx {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Emp emp = new Emp(111, "Ramesh");
		
		//Serializing the emp object : writing the object to file
		
		FileOutputStream outputStream = new FileOutputStream("abc.txt"); //writing object to abc.txt file format
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream); //write object to outputStream file, outputStream file is nothing but abc.txt
		objectOutputStream.writeObject(emp); //writing emp object
		
		System.out.println("Serialization process completed.....");
		objectOutputStream.close();
		
		//case-2:shortcut, one line to perform serialization
		//new ObjectOutputStream(new FileOutputStream("abc.txt")).writeObject(emp);
		
		//case-1: deserialization of emp object : reading the object from file
		FileInputStream oStream = new FileInputStream("abc.txt");
		ObjectInputStream objectInputStream = new ObjectInputStream(oStream);
		Emp e = (Emp)objectInputStream.readObject();
		System.out.println(e.id+" "+e.ename);
		objectInputStream.close();
		System.out.println("DeSerialization process completed.....");

		
//		case-2:shortcut, one line to perform Deserialization
//		Emp e = (Emp)new ObjectInputStream(new FileInputStream("abc.txt")).readObject();
//		System.out.println(e.id+" "+e.ename);
//		System.out.println("DeSerialization process completed.....");
	}

}
