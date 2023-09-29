package com.rameshsoft.set;

import java.util.TreeSet;

public class TreeSetEx3 {
	public static void main(String[] args) {
		//case-1:Default constructor(Sorting order done)
		TreeSet<String> t1 = new TreeSet<String>();
		t1.add("Ramesh");
		t1.add("Abhilash");
		TreeSet<String> t2 = new TreeSet<String>(t1);
		t2.add("AAA");
		t2.add("BBB");
		System.out.println(t2);
	}
}
/*
o/p:
	[AAA, Abhilash, BBB, Ramesh]
*/