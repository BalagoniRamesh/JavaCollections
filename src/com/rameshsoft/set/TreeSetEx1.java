package com.rameshsoft.set;

import java.util.TreeSet;

public class TreeSetEx1 {

	public static void main(String[] args) {
		//case-1: Default constructor(Default/Natural Sorting order constructor)
		TreeSet<String> t = new TreeSet<String>();
		t.add("z");
		t.add("Ramesh4");
		t.add("Ramesh1");
		t.add("Ramesh2");
		t.add("Ramesh3");
		
		System.out.println(t);
		
		TreeSet<Integer> t1 = new TreeSet<Integer>();
		t1.add(100);
		t1.add(4);
		t1.add(1);
		t1.add(2);
		t1.add(3);
		
		System.out.println(t1);
		
	}

}
/*
o/p:
	>Data is sorted order
	[Ramesh1, Ramesh2, Ramesh3, Ramesh4, z]
	[1, 2, 3, 4, 100]
*/


