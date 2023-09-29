package com.rameshsoft.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetEx {
//Duplicates accept first occurrence only and not raise any error, with out error it ignore data
	public static void main(String[] args) {
		
		LinkedHashSet<String> h = new LinkedHashSet<String>();
		//Which one inserting we know we use sysout, out put will be boolean
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
  	>Insertion order preserved, ordered, which order we insert data, same order we get the output 
	true
	false
	
	Ramesh
	King
	Virat
*/
