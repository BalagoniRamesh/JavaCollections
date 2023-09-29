package com.rameshsoft.SerializableEx;

import java.util.ArrayList;

public class CloneingEx {
	public static void main(String[] args) {
		
		ArrayList<String> objs = new ArrayList<String>();
		objs.add("anu");
		objs.add("ratan");
		objs.add("sravya");
		System.out.println(objs);
		
		ArrayList<String> copydata = (ArrayList<String>) objs.clone();
		copydata.add("aaa");
		System.out.println(copydata);
		 
	}

}
/*
o/p:
	[anu, ratan, sravya]
	[anu, ratan, sravya, aaa]
*/