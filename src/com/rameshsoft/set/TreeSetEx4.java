package com.rameshsoft.set;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetEx4 {

	public static void main(String[] args) {
		TreeSet<Integer> t = new TreeSet<Integer>();
		for(int i=1; i<=10; i++)
		{	t.add(i);
		}
		System.out.println(t);
		
		SortedSet<Integer> s1 =t.subSet(3, 7);  //subset return type is SortedSet object, subset return some specific elements, 3 included 7 excluded, s1 is a SortedSet object
		TreeSet<Integer> t1 = new TreeSet<Integer>(s1); 
		System.out.println(t1);
		
		SortedSet<Integer> s2 = t.tailSet(4);
		TreeSet<Integer> t2 = new TreeSet<Integer>(s2);  
		System.out.println(t2);
		
		SortedSet<Integer> s3 = t.headSet(6);
		TreeSet<Integer> t3 = new TreeSet<Integer>(s3);  
		System.out.println(t3);
		
		
	}

}
/*
o/p:
	Note: All method return type is SortedSet
	[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
	[3, 4, 5, 6]
	[4, 5, 6, 7, 8, 9, 10]
	[1, 2, 3, 4, 5]
	*/
