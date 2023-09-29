package com.rameshsoft.map;
//Adding one map data to another map
import java.util.HashMap;

public class HashMapEx2 {

	public static void main(String[] args) {
		//duplicate keys are not allowed 
		HashMap<Integer, String> h1 = new HashMap<Integer, String>();
		h1.put(111, "Ramesh");
		h1.put(222, "Sravani");	
		h1.put(111, "Ramesh");
		System.out.println(h1);		
		
		//values can be duplicated 
		HashMap<Integer, String> h2 = new HashMap<Integer, String>(h1);
		h2.put(111, "Ramesh");
		h2.put(222, "Ramesh");
		h2.put(1000, "Sridhar");
		System.out.println(h2);
		}
}
/*
o/p:
{222=Sravani, 111=Ramesh}
{1000=Sridhar, 222=Ramesh, 111=Ramesh}
*/