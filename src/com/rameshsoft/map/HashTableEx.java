package com.rameshsoft.map;

import java.util.Hashtable;

public class HashTableEx {

	public static void main(String[] args) {
		Hashtable<Integer, String> h = new Hashtable<Integer, String>();
		h.put(11, "Ratan");
		h.put(22, "anu");
		h.put(33, "sravani");
		System.out.println(h);
		System.out.println(h.size());
		
		System.out.println(h.get(11));
		System.out.println(h.get(111)); //[if the key is not present it returns null]

		System.out.println(h.containsKey(33));
		h.remove(33);
		System.out.println(h.containsKey(33));
		
		System.out.println(h.containsValue("Ratan"));
		
		System.out.println(h.isEmpty());
		h.clear();
		System.out.println(h.isEmpty());
	}

}
/*
o/p
{33=sravani, 22=anu, 11=Ratan}
3
Ratan
null
true
false
true
false
true
*/