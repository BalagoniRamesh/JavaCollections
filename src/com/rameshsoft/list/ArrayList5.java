package com.rameshsoft.list;
//I want print Ramesh 10 times with out for loop
import java.util.ArrayList;
import java.util.Collections;

public class ArrayList5 {
	public static void main(String[] args) {
		//Generic version String type, Collections class contain nCopies method
		ArrayList<String> obj = new ArrayList<String>(Collections.nCopies(10, "Ratan"));
		//ArrayList<Emp> obj = new ArrayList<Emp>(Collections.nCopies(10, new Emp));
		System.out.println(obj);
		
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Ramesh");
		a1.add("Mahesh");
		a1.add("Purna");
		a1.add("Kalyan");
		
		System.out.println("Befor swapping: "+a1);
		Collections.swap(a1, 1, 3);
		System.out.println("After swapping: "+a1);		
	}
}
/*
o/p:
	[Ratan, Ratan, Ratan, Ratan, Ratan, Ratan, Ratan, Ratan, Ratan, Ratan]
			Befor swaping: [Ramesh, Mahesh, Purna, Kalyan]
			After swaping: [Ramesh, Kalyan, Purna, Mahesh]
			*/
