package com.rameshsoft.SerializableEx;

import java.io.Serializable;

public class Emp implements Serializable{  //Serializable marker interface 
	int id;
	String ename;
	//transient String ename;
	public Emp(int id, String ename) {
		super();
		this.id = id;
		this.ename = ename;
	}
	

}
