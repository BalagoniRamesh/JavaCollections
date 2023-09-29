package com.rameshsoft.list;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList9 {

	public static void main(String[] args) {
		// conversion of arrays to collections
		String[] str = {"Ramesh", "Rani", "KKR"}; //String Array
		//Arrays class belongs to util package contain method like asList()
		ArrayList<String> objs = new ArrayList<String>(Arrays.asList(str));
		objs.add("aaa");
		objs.add("bbb");
		System.out.println(objs);
		System.out.println("****************************");
		//case-1: Know type of data
		//generic version Collections to Arrays, use toArray with arrgument
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Charan");
		a1.add("Anu");
		a1.add("Sreshta");
		
		String[] s = new String[a1.size()];
		a1.toArray(s);  //to array with argument
		for(String ss : s)
		{
			System.out.println(ss);
		}
		System.out.println("****************************");
		//case-2: Don't no which type of data, use toArray with out arrgument
		//normal version collection to Array
		ArrayList data = new ArrayList();
		data.add(10);
		data.add("Ramesh");
		data.add(10.5);
		
		Object[] o = data.toArray();
		for(Object oo: o) //object hold any type of data
		{  System.out.println(oo);
		}		
			
	}

}
