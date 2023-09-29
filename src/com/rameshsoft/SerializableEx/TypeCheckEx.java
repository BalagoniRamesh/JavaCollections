package com.rameshsoft.SerializableEx;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

public class TypeCheckEx {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		System.out.println(al instanceof List);
		System.out.println(al instanceof Collection);
		System.out.println(al instanceof Iterable);
		System.out.println(al instanceof Cloneable);
		System.out.println(al instanceof Serializable);
		System.out.println(al instanceof RandomAccess);
	}

}
/*
o/p: 
true
true
true
true
true
true
*/