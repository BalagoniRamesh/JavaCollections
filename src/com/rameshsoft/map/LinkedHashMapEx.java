package com.rameshsoft.map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapEx {

	public static void main(String[] args) {
		LinkedHashMap<Emp, Student> h = new LinkedHashMap<Emp, Student>();
		h.put(new Emp(111, "Ramesh"), new Student(1, "aaa"));
		h.put(new Emp(222,"anu"), new Student(2, "bbb"));
		h.put(new Emp(333, "naresh"), new Student(3,"ccc"));
		
		Set<Entry<Emp, Student>> s =   h.entrySet();
		Iterator<Entry<Emp, Student>> itr = s.iterator();
		while(itr.hasNext())
		{
			Entry<Emp, Student> e =itr.next();
			Emp ee = e.getKey();
			System.out.println("Employee Data: "+ee.eid+" "+ee.ename);
			
			Student ss = e.getValue();
			System.out.println("Student Data: "+ss.sid+" "+ss.sname);
		}		
	}

}
/*
o/p:
Employee Data: 111 Ramesh
Student Data: 1 aaa
Employee Data: 222 anu
Student Data: 2 bbb
Employee Data: 333 naresh
Student Data: 3 ccc
*/