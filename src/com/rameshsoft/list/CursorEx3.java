package com.rameshsoft.list;
//ArrayList : ListIterator ->remove, set
import java.util.ArrayList;
import java.util.ListIterator;

public class CursorEx3 {
	public static void main(String[] args) {
		ArrayList<String> objects = new ArrayList<String>();
		objects.add("Sachin");
		objects.add("Virat");
		objects.add("Ramesh");
		objects.add("Suresh");
		
		ListIterator<String> lstr = objects.listIterator();
		lstr.add("ram");   //It willl add first object, cursor points
		System.out.println("Before: "+objects); //[ram, Sachin, Virat, Ramesh, Suresh]
		//Read data forward direction
		while(lstr.hasNext()) 
		{
			String str =lstr.next();
			if(str.equals("Sachin")) {
				lstr.remove();
			}
			if(str.equals("Virat")) {
				lstr.set("Panth");
			}
		}		
		System.out.println("After: "+objects);//[ram, Panth, Ramesh, Suresh]
		
	}

}
