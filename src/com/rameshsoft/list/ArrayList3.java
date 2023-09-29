package com.rameshsoft.list;

import java.util.ArrayList;
//ArrayList used to retrieve the data using For each loop & generics 
public class ArrayList3 {

	public static void main(String[] args) {
		
		//Arrays are type safe
		int[] a = {10, 20, 30};
		for(int aa : a) //To print the data here only integer data
		{	System.out.println(aa);
		}
		
		//Collections are not type safe
		ArrayList objs = new ArrayList();
		objs.add(new Emp(111, "Ramesh"));
		objs.add(new Student(1, "Rani"));
		objs.add(null);
		//case:1 Reading data for each loop
		for(Object o: objs) //Object class(Object) hold the all objects
		{
			if(o instanceof Emp) {
				Emp e = (Emp)o; //Type Casting
				System.out.println(e.eid+" "+e.ename);
			}
			if(o instanceof Student) {
				Student e = (Student)o;
				System.out.println(e.sid+" "+e.sname);
			}
			if(o == null)  //object reference compare and print null object
			{
				System.out.println(o); 
			}
		}
		
		//case:2 Reading data using one object with get method
		Student ss =(Student)objs.get(1); //Student object is 1 index
		//Student ss =(Student)objs.get(99th element);
		//Student ss =(Student)objs.get(66th element);
		System.out.println(ss.sid+" "+ss.sname);
		
		//case 3: use Collection Generics provide the type safety to collections < >
		//Collection Generics & arrays used to store same like Homogeneous data, but why generics   
		ArrayList<Emp> emps = new ArrayList<Emp>();
		emps.add(new Emp(957 , "Ramesh"));
		emps.add(new Emp(956, "Rani"));
		for(Emp e:emps)
		{
			System.out.println(e.eid+" "+e.ename);
		}
		Emp e=emps.get(1); //with out type casting store the data
		System.out.println(e.eid+" "+e.ename);	
		
	}

}
/*
o/p:
10
20
30

111 Ramesh
1 Rani
null

1 Rani
957 Ramesh

956 Rani
956 Rani
*/




