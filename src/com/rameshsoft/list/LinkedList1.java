package com.rameshsoft.list;

import java.util.LinkedList;

class LinkedList1
{
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add("B");
		l.add("C");
		l.add("D");
		l.add(null);
		l.add("E");
		l.addLast("Z");
		l.addFirst("A");
		l.add(1, "A1");
		System.out.println("Orginal content:-"+l);
		
		l.removeFirst();
		l.removeLast();
		System.out.println("After deletion first & last:-"+l);
		
		l.remove("E");
		l.remove(2);
		System.out.println("After deletion :-"+l);
		
		l.set(2, "KIran");
		System.out.println("After setting:-"+l);
		System.out.println(l.isEmpty());
		l.clear();
		System.out.println(l.isEmpty());
	}
}