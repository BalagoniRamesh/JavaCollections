package com.rameshsoft.list;

import java.util.ArrayList;
import java.util.LinkedList;

//Add any collection data into any collection
class LinkedListAdd1C_2C {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Ramesh");
		LinkedList<String> linked = new LinkedList<String>(al);
		linked.add("Purna");
		System.out.println(linked);
	}
}
