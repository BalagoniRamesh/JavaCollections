package com.rameshsoft.map;
//Constructor-2 
import java.util.TreeMap;

public class TreeMapEx2 {

	public static void main(String[] args) {
		TreeMap<Integer, String> h = new TreeMap<Integer, String>((i1,i2)->-i1.compareTo(i2));
		h.put(444, "Ramesh");
		h.put(222, "Sreeja");
		h.put(111, "aaa");
		h.put(333, "ccc");
		System.out.println(h);

		
		
	}

}
/*
  o/p:
  >Comparator consist of comapre(), comapare method consist two arguments i1, i2, compare method compare two objects
  >i1.compareTo(i2) By default take ascending order, if you want descending order take -i1.compareTo(i2) 
  The keys will be sorted
  {444=Ramesh, 333=ccc, 222=Sreeja, 111=aaa} //descending order
 */
