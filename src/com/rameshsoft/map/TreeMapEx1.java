package com.rameshsoft.map;
//Constructor-1 
import java.util.TreeMap;

public class TreeMapEx1 {

	public static void main(String[] args) {
		TreeMap<Integer, String> h = new TreeMap<Integer, String>();
		h.put(444, "Ramesh");
		h.put(222, "Sreeja");
		h.put(111, "aaa");
		h.put(333, "ccc");
		System.out.println(h);

		
		
	}

}
/*
  o/p:
  The keys will be sorted
  {111=aaa, 222=Sreeja, 333=ccc, 444=Ramesh}
 */
