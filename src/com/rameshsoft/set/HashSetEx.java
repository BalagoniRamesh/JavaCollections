package com.rameshsoft.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {
//Duplicates accept first occurrence only and not raise any error, with out error it ignore data
	public static void main(String[] args) {
		
		HashSet<String> h = new HashSet<String>();			
		System.out.println(h.add("Ramesh"));//true, first value inserted
		h.add("King");
		h.add("Virat");
		System.out.println(h.add("Ramesh"));//false, next value ignored  //duplicate
		
		Iterator<String> itr =h.iterator();
		while(itr.hasNext()) 
		{
			String str = itr.next();
			System.out.println(str);
		}
	}

}
/*
o/p:
case-1:HashSet
	>Insertion order not preserved, unordered
	true
	false
	King
	Ramesh
	Virat

*/
