package com.rameshsoft.list;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListGenirics {
	public static void main(String[] args) {
		//Taking Different Values from end user into ArrayList
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first obj Integer");
		int valu1 = scanner.nextInt();
		System.out.println("Enter second obj Double");
		double valu2 = scanner.nextDouble();
		System.out.println("Enter third obj String");
		String valu3 = scanner.next();
		
		ArrayList objs = new ArrayList();
		objs.add(valu1);
		objs.add(valu2);
		objs.add(valu3);
		System.out.println("ArrayList Data: "+objs);
		
		//Taking 5 Integer values from end user store into ArrayList
		ArrayList<Integer> intobjs = new ArrayList<Integer>();
		for(int i=1; i<=5; i++)
		{	System.out.println("Enter "+i+" value :");
			intobjs.add(scanner.nextInt());
		}
		System.out.println("ArrayList Data:"+intobjs);
		scanner.close();		
	}
}
/*
o/p:
	Enter first obj Integer
	12
	Enter second obj Double
	5.3
	Enter third obj String
	Ramesh
	ArrayList Data: [12, 5.3, Ramesh]
	Enter 1value :
*/