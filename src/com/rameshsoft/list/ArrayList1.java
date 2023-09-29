package com.rameshsoft.list;

import java.util.ArrayList;
//Adding objects to ArrayList
public class ArrayList1 {
	public static void main(String[] args)
	{
		ArrayList objs = new ArrayList();
		objs.add("10");
		objs.add("ramesh");
		objs.add("10");
		objs.add(null);
		objs.add("10.5");
		System.out.println(objs);
		System.out.println(objs.toString());
	}
}
//o/p:
//	[10, ramesh, 10, null, 10.5]
//	[10, ramesh, 10, null, 10.5]
//dublicates allowed
//null(Empty values) allowed
//isertion order preserved
