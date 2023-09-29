package com.rameshsoft.list;

import java.util.Stack;

//Stack program last in first out(LIFO)
public class Stack1 {

	public static void main(String[] args) {
		Stack<String> s = new Stack<String>();
		s.push("Ramesh1");
		s.push("Ramesh2");
		s.push("Ramesh3");
		s.push("Ramesh4");
		
		System.out.println(s);
		System.out.println(s.size()); //4
		s.pop();//LIFO
		System.out.println(s);  //[Ramesh1, Ramesh2, Ramesh3]
		System.out.println(s.search("Ramesh3")); //1
		System.out.println(s.peek());  //Ramesh3

		System.out.println(s.empty());//false
		s.clear();
		System.out.println(s.empty());//true
		
	}

}
