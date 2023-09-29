package com.rameshsoft.list;
//Vector constructors-4 types
import java.util.ArrayList;
import java.util.Vector;

public class VectorEx1 {
	public static void main(String[] args) {
		System.out.println("******default******");
		//Constructor-1: Constructs an empty vector
		Vector<String> objects = new Vector<String>();
		objects.add("Ramesh");
		objects.add("Rani");
		objects.add("Purna");
		objects.add("Suresh");
		System.out.println(objects.capacity());
		
		System.out.println("******initialCapacity******");
		
		//Constructor-2: User defined Vector Constructs initialCapacity
		Vector<String> objs = new Vector<String>(3);
		System.out.println(objects.capacity()); //3
		objects.add("Ramesh");
		objects.add("Rani");
		objects.add("Purna");
		objects.add("Suresh");
		System.out.println(objs.capacity()); //6
		
		System.out.println("******initialCapacity capacityIncrement******");
		//Constructor-3: User defined Vector Constructs specifies initialCapacity capacityIncrement
		Vector<String> objes = new Vector<String>(2, 6);  //2+6 = 8
		System.out.println(objes.capacity()); //2
		objes.add("Ramesh");
		objes.add("Rani");
		objes.add("Purna");
		objes.add("Suresh");		
		System.out.println(objes.capacity()); //8(2+6)
		System.out.println("******one collection data into another collection******");
		//Constructor-4: Adding one collection data into another collection
		ArrayList<String> al = new ArrayList<String>();
		al.add("anusha");
		Vector<String> v = new Vector<String>(al);
		v.add("Ramesh");
		v.add("Purna");
		System.out.println(v);

		
		
	}

}
