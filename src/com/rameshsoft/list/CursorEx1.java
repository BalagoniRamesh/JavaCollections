package com.rameshsoft.list;

import java.util.ArrayList;
import java.util.Iterator;

public class CursorEx1 {
	public static void main(String[] args) {	
	
	ArrayList<String> objs = new ArrayList<String>();
	objs.add("Sachin");
	objs.add("Virat");
	objs.add("Ramesh");
	objs.add("Suresh");
	
	System.out.println("*****Read the data using for each loop*******");
	//Read the data using for each loop
	for(String s : objs) 
	{	System.out.println(s);		
	}
	
	System.out.println("*****Read the data using get() method*******");
	//Read the data using get() method
	String name = objs.get(2);
	System.out.println(name);
	
	System.out.println("*****Read the data using normal cursor*******");
	//case-1: Read the data using normal cursor : Iterator
	//Iterator read any type of data
	Iterator itr  = objs.iterator();  
	while(itr.hasNext()) 
	{
		String s = (String)itr.next(); //Type casting
		System.out.println(s);
	}
	System.out.println("*****Read the data using generic cursor*******");
	//case-2: Read the data using generic cursor : Iterator
	//Iterator read here string type of data, no type casting required
	Iterator<String> sitr  = objs.iterator();  
	while(sitr.hasNext()) 
	{
		String s = sitr.next();
		System.out.println(s);
	}
	System.out.println("*****for each method : using lambda*****");
	//case-1: Reading data using forEach() method : using lambda         :  java 8 
	objs.forEach(strData -> System.out.println(strData));	
	
	//lamda expression means you are taking argument
	//strData is a variable, this variable have data type(String), but not used here not required
	//strData -> System.out.println(strData)    : This one implementation of action() metho

	System.out.println("*****for each method : using method reference*****");
	//case-2: Reading data using forEach() method : using method reference  : java8
	objs.forEach(System.out::println);

	//here no need to take variable, out just you like two columns(::), variable it will take internally, no need to give, 
	//System.out::println  > this is also providing implementation of action method only
	//>method reference means, let them decide argument internally 	
	
	System.out.println("*****operations are completed*****");
	}
}
