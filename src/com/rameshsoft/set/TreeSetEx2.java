package com.rameshsoft.set;

import java.util.TreeSet;

public class TreeSetEx2 {

	public static void main(String[] args) {
		//case-1:Default constructor(Sorting order done)
		TreeSet<String> t = new TreeSet<String>((s1, s2)->-s1.compareTo(s2));
		t.add("Ramesh");
		t.add("Abhilash");
		t.add("Suman");
		t.add("KP");
		t.add("Z");
		t.add("A");
		System.out.println(t);
	}
}
/*
o/p: [Z, Suman, Ramesh, KP, Abhilash, A]
Notes:
	>Data printing descending order
	>(s1, s2)->-s1.compareTo(s2), S1,S2 two objects, -> is lambda, -(minus gives output descending order) 
	>(s1, s2)->s1.compareTo(s2)  here minus not there it will give out put asscending order
	
*/