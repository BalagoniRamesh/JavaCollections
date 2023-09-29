package com.rameshsoft.map;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class TreeMapEx3 {
	public static void main(String[] args) {
		TreeMap<Integer, String> t1 = new TreeMap<Integer, String>();
		t1.put(444, "Ramesh");
		t1.put(222, "Sreeja");
		TreeMap<Integer, String> t2 = new TreeMap<Integer, String>(t1);
		t2.put(111, "aaa");
		t2.put(333, "ccc");
		System.out.println(t2);
		
		//By using putAll() to add the data : many to one.
		LinkedHashMap<Integer, String> h1 = new LinkedHashMap<Integer, String>();
		h1.put(111, "ratan");
		LinkedHashMap<Integer, String> h2 = new LinkedHashMap<Integer, String>();
		h2.put(222,"anu");
		LinkedHashMap<Integer, String> h3 = new LinkedHashMap<Integer, String>();
		h3.putAll(h1);
		h3.putAll(h2);
		h3.put(333, "purna");
		System.out.println(h3);
	}
	
}
/*
o/p:
{111=aaa, 222=Sreeja, 333=ccc, 444=Ramesh}
{111=ratan, 222=anu}
*/
