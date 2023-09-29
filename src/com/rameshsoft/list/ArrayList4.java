package com.rameshsoft.list;

import java.util.ArrayList;

public class ArrayList4 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add("10.5");
		al.add("Ramesh");
		al.add("Suresh");
		al.add(10);
		al.add(null);
	    System.out.println(al); //[10, 10.5, Ramesh, Suresh, 10, null]
	    System.out.println(al.size());  //6
	    
	    al.add(3,"Rani");				

	    System.out.println(al);   //[10, 10.5, Ramesh, Rani, Suresh, 10, null]
	    
	    al.remove(2);  //Here it will remove based on index
	    al.remove("Suresh");  ////Here it will remove based on value
	    System.out.println(al);	//[10, xxx, Rani, 10, null]
	    
	    al.set(1, "xxx");
	    System.out.println(al); //[10, xxx, Rani, 10, null]
	    System.out.println(al.isEmpty());//false
	    al.clear();
	    System.err.println(al.isEmpty());//true	
		
	}

}
