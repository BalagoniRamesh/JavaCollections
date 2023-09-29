package com.rameshsoft.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class CursorEx2 {
	public static void main(String[] args) {
	ArrayList<Book> objs = new ArrayList<Book>();
	objs.add(new Book(111, "c", "DenisRiche"));
	objs.add(new Book(222, "c++", "StrouStrup"));
	objs.add(new Book(111, "java", "JemsGosiling"));
	objs.add(new Book(111, "python", "GuidoVanRossum"));
		
	//Read the data using for-each loop			
	for(Book o : objs) 
	{	System.out.println(o.bid+" "+o.bname+" "+o.bauthor);
	}
	
	System.out.println("****************************");
	
	//Read the data using get() method
	Book b=objs.get(2);
	System.out.println(b.bid+" "+b.bname+" "+b.bauthor);
	
	System.out.println("****************************");
	
	//Read the data using geniric cursor :ListIterator
	ListIterator<Book> litr = objs.listIterator();
	while(litr.hasNext()) {
		Book bb = litr.next();
		System.out.println(bb.bid+" "+bb.bname+" "+bb.bauthor);
	}
	
	System.out.println("****************************");
	//Reading the data using forEach() method : using Lambda
	objs.forEach(bbb->System.out.println(bbb.bid+" "+bbb.bname+" "+bbb.bauthor));
			
	}
	
	
}


