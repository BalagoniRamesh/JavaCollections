package com.rameshsoft.SerializableEx;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesEx {

	public static void main(String[] args) throws IOException {
		//load the properties file 
		FileInputStream inputStream = new FileInputStream("abc.properties"); //find location
		Properties properties = new Properties(); //Properties class
		properties.load(inputStream);    //load the property file
		
		//shortcut
		//Properties properties = new Properties(); 
		//properties.load(new FileInputStream("abc.properties"));    //load the property file
		
		//read the data from properties file
		System.out.println(properties.getProperty("ippppp"));
		System.out.println(properties.getProperty("username"));
		System.out.println(properties.getProperty("passwwwwd"));
		System.out.println(properties.getProperty("port"));  //key we give wrong name we default value has String data type null
		
	}

}
