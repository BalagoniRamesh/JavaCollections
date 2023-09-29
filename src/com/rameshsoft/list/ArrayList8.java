package com.rameshsoft.list;
import java.util.ArrayList;
public class ArrayList8 {
	public static void main(String[] args) {
			
		ArrayList<Emp> a1 = new ArrayList<Emp>();
		a1.add(new Emp(1, "Ramesh"));
		a1.add(new Emp(2, "Ramya"));
		
		ArrayList<Emp> a2 = new ArrayList<Emp>(a1);
		a2.add(new Emp(3, "Sravani"));
		a2.add(new Emp(4, "Sreeja"));
		//execute either case-1 or case-2
		//case-1: remove 		
		a2.removeAll(a1);
//		a2.retainAll(a1);
		//case-2:retain		
//		a2.removeAll(a1);
//		a2.retainAll(a1);
		for(Emp e : a2)
		{
			System.out.println(e.eid+" "+e.ename);
		}
		System.out.println("operations are completed... ");
		
	}
}
/*
o/p:
	case-1:removeAll
	3 Sravani
	4 Sreeja
	
	case-1:retainAll(only retain elements printed)
	1 Ramesh
	2 Ramya
*/
