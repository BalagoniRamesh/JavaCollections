package com.rameshsoft.SerializableEx;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableDeSerializableMultiObjectsEx {
	
	void serialization() throws Exception 
	{
		Emp e = new Emp(111, "Ramesh");
		Dog d = new Dog(222, "chinnu");
		Cat c = new Cat(333, "buddy");
		//serialization [write the object to file]
		FileOutputStream fos = new FileOutputStream("xyzfile.txt");
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		oos.writeObject(e);
		oos.writeObject(d);
		oos.writeObject(c);
		System.out.println("Serialization of multiple objects completed....");
	}
	void deserialization() throws Exception
	{ //deserialization [read object from text file]
		
		FileInputStream fis = new FileInputStream("xyzfile.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Emp e = (Emp)ois.readObject(); //returns object
		Dog d = (Dog)ois.readObject();
		Cat c = (Cat)ois.readObject();
		System.out.println(e.id+" "+e.ename);
		System.out.println(d.id+" "+d.name);
		System.out.println(c.id+" "+c.name);
		System.out.println("deserialization completed");
	}
		public static void main(String[] args) throws Exception {
			SerializableDeSerializableMultiObjectsEx s = new SerializableDeSerializableMultiObjectsEx();
			s.serialization();
			s.deserialization();
		}

}
