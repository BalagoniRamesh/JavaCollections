package com.rameshsoft.SerializableEx;

import java.io.Serializable;

public class Cat implements Serializable {
	int id;
	String name;
	public Cat(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

}
