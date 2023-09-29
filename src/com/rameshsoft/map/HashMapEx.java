package com.rameshsoft.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
		HashMap<Integer, String> h = new HashMap<Integer, String>();
		h.put(111, "Ramesh");
		h.put(222, "Sravani");
		h.put(333, "Kirthi");
		h.put(444, "Ganesh");
		System.out.println(h);	
		
		//Reading the only keys using : keySet()
		Set<Integer> s = h.keySet(); //keys are called Integer 
		System.out.println(s);
		
		//Reading the only values using : values()
		Collection<String> c= h.values(); //values are called String
		System.out.println(c);
		
		//Reading the both key, value using : entrySet()
		Set<Entry<Integer, String>> ss=h.entrySet(); //Generic type: Both key and vale called entry, Entry interface used
		Iterator<Entry<Integer, String>> itr = ss.iterator();
		while(itr.hasNext())
		{
			Entry<Integer, String> e = itr.next();
			Integer k = e.getKey();
			System.out.println("Key: "+k);
			
			String v = e.getValue();
			System.out.println("Value: "+v);
		}
	}
}
/*
o/p: Un ordered data, HashMap insertion order not-predictable
{444=Ganesh, 333=Kirthi, 222=Sravani, 111=Ramesh}
[444, 333, 222, 111]
[Ganesh, Kirthi, Sravani, Ramesh]
Key: 444
Value: Ganesh
Key: 333
Value: Kirthi
Key: 222
Value: Sravani
Key: 111
Value: Ramesh
*/