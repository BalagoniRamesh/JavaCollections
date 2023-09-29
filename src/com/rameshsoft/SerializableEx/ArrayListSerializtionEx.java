package com.rameshsoft.SerializableEx;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

//Case-3
public class ArrayListSerializtionEx {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ArrayList<Emp> al = new ArrayList<Emp>();
		al.add(new Emp(111, "Ramesh"));
		al.add(new Emp(222, "anu"));
		
		//Serialization process
		FileOutputStream outputStream= new FileOutputStream("abc.txt");
		ObjectOutputStream objectOutputStream= new ObjectOutputStream(outputStream);
		objectOutputStream.writeObject(al);
		objectOutputStream.close();
		System.out.println("Serialization process completed.....");
		
		//Deserialization process
		FileInputStream fileInputStream= new FileInputStream("abc.txt");
		ObjectInputStream objectInputStream= new ObjectInputStream(fileInputStream);
		ArrayList<Emp> objs = (ArrayList<Emp>)objectInputStream.readObject();//while reading the object type casting to ArrayList Object 
		for(Emp e:objs) 
		{
			System.out.println(e.id+" "+ e.ename);			
		}
		objectInputStream.close();
		System.out.println("Deseeialization process completed.....");
		

	}

}
