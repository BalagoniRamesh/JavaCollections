package com.rameshsoft.map;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapEx4 {
	public static void main(String[] args) {
		TreeMap<Integer, String> t = new TreeMap<Integer, String>();
		t.put(10, "Ramesh");
		t.put(20, "Sreeja");
		t.put(5, "aaa");
		t.put(6, "ccc");
		t.put(1, "kkr");
		System.out.println(t); //Ascending order
		
		//From huge data you are going subMap, tailMap & headMap
		//From complete tree data you are taking sub data, after taking sub data we can creating new treeMap 
		SortedMap<Integer, String> sm = t.subMap(5, 20); //5 included, 20 excluded
		TreeMap<Integer, String> tt = new TreeMap<Integer, String>(sm); 
		System.out.println(tt);
		
		SortedMap<Integer, String> sm1 = t.tailMap(10); //10 included, back element, 10 means starting value included
		TreeMap<Integer, String> t1 = new TreeMap<Integer, String>(sm1);
		System.out.println(t1);
		
		SortedMap<Integer, String> sm2 = t.headMap(10); //10 excluding, starting values, 10 means ending value excluded
		TreeMap<Integer, String> t2 = new TreeMap<Integer, String>(sm2);
		System.out.println(t2);	
		
	}
}
/*
 o/p:
 {1=kkr, 5=aaa, 6=ccc, 10=Ramesh, 20=Sreeja}
{5=aaa, 6=ccc, 10=Ramesh}
{10=Ramesh, 20=Sreeja}
{1=kkr, 5=aaa, 6=ccc}
*/
