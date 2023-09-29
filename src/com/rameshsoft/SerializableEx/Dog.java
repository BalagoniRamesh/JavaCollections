package com.rameshsoft.SerializableEx;

import java.io.Serializable;

public class Dog implements Serializable{
	int id;
	String name;
	public Dog(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

}
