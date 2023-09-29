package com.rameshsoft.list;
//Constructor Approach: Adding one collection into another collection
import java.util.ArrayList;

public class ArrayList6 {

	public static void main(String[] args) {
		//Constructor Approach: Adding one collection into another collection
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Ramesh");
		a1.add("Rani");
		
		ArrayList<String> a2 = new ArrayList<String>(a1);
		a2.add("Purna");
		a2.add("Kalyan");
		System.out.println(a2);//[Ramesh, Rani, Purna, Kalyan]
		
		//addAll() Approach: Adding many Collections into another collection: many into one
		ArrayList<Integer> objs1 = new ArrayList<Integer>();
		objs1.add(10);
		objs1.add(20);
		ArrayList<Integer> objs2 = new ArrayList<Integer>();
		objs2.add(100);
		objs2.add(201);

        // Declaring the ArrayList
		ArrayList<Integer> objs3 = new ArrayList<Integer>();
		objs3.addAll(objs1); //addAll used to add collection data
		objs3.addAll(objs2);
		objs3.add(1000);
		System.out.println(objs3); //[10, 20, 100, 201, 1000]

		



	}

}
