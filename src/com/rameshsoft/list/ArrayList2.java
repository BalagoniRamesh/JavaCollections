package com.rameshsoft.list;

import java.util.ArrayList;
//ArrayList used to retrieve the data
public class ArrayList2 {

	public static void main(String[] args) {
		ArrayList objs = new ArrayList();
		objs.add(new Emp(111, "Ramesh"));
		objs.add(new Student(1, "Rani"));
		objs.add(null);
		//case:1 Reading data for-each loop
		for(Object o: objs) //All Object class hold the all objects
		{
			if(o instanceof Emp) {
				Emp e = (Emp)o; //Type Casting
				System.out.println(e.eid+" "+e.ename);
			}
			if(o instanceof Student) {
				Student e = (Student)o;
				System.out.println(e.sid+" "+e.sname);
			}
			if(o == null)
			{
				System.out.println(o); //object reference compare and print null object
			}
		}
		//case:2 Reading data using one object with get method
		Student ss =(Student)objs.get(1); //Student object is 1 index
		//Student ss =(Student)objs.get(99th element);
		//Student ss =(Student)objs.get(66th element);
		System.out.println(ss.sid+" "+ss.sname);
		
		
	}

}
/*
o/p:
	111 Ramesh
	1 Rani
	null
	1 Rani
*/




