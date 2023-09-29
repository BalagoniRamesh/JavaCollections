package com.rameshsoft.list;

import java.util.ArrayList;

public class ArrayList7 {
	public static void main(String[] args) {
		Emp e1 = new Emp(1, "Ramesh");
		Emp e2 = new Emp(2, "Ramya");
		Emp e3 = new Emp(3, "Sravani");
		Emp e4 = new Emp(4, "Sreeja");
		
		ArrayList<Emp> a1 = new ArrayList<Emp>();
		a1.add(e1);
		a1.add(e2);
		
		ArrayList<Emp> a2 = new ArrayList<Emp>();
		a2.addAll(a1);
		a2.add(e3);
		a2.add(e4);
		
		System.out.println(a2.contains(e1));//true
		System.out.println(a2.containsAll(a1));//true
		
		a2.remove(e1);
		
		System.out.println(a2.contains(e1));//false
		System.out.println(a2.containsAll(a1));//false
		
		for(Emp e : a2)
		{
			System.out.println(e.eid+" "+e.ename);
		}
		
	}

}
/*
o/p:
	true
	true
	false
	false
	2 Ramya
	3 Sravani
	4 Sreeja
	*/
