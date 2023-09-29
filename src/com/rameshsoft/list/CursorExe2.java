package com.rameshsoft.list;
//Cursor : Iterator
import java.util.ArrayList;
import java.util.Iterator;

public class CursorExe2 {
	public static void main(String[] args) {	
		
	ArrayList<String> objects = new ArrayList<String>();
	objects.add("Sachin");
	objects.add("Virat");
	objects.add("Ramesh");
	objects.add("Suresh");
	Iterator<String> itr = objects.iterator();
	while(itr.hasNext())
	{
		String s = itr.next();
		if(s.equals("Ramesh")) {
			itr.remove();  //[Sachin, Virat, Suresh]
		}
	}
	System.out.println(objects);
	}

}
