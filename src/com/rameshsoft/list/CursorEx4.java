package com.rameshsoft.list;
//ArrayList : ListIterator ->hasNext vs hasPrevious
import java.util.ArrayList;
import java.util.ListIterator;

public class CursorEx4 {
	public static void main(String[] args) {
		ArrayList<String> objects = new ArrayList<String>();
		objects.add("Sachin");
		objects.add("Virat");
		objects.add("Ramesh");
		objects.add("Suresh");
		
		ListIterator<String> lstr = objects.listIterator();
		System.out.println("****** Read data forward direction ********* "); 
		//Read data forward direction
		while(lstr.hasNext()) 
		{
			String s = lstr.next();
			System.out.println(s);
		}
		System.out.println("******Read data Backward direction ******"); 
		while(lstr.hasPrevious())
		{
			String str= lstr.previous();
			System.out.println(str);
		}
		
	}

}
