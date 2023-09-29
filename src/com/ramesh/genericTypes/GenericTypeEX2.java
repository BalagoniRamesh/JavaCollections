/*package com.ramesh.genericTypes;
//this functionality Wildcard(?) from java 8 version
import java.util.ArrayList;
import java.util.List;
class Animal{
	
}
class Dog extends Animal{	
}
class Cat extends Animal{	
}


class GenericTypeEX2 {

	public static void main(String[] args) {
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(new Animal());
		animals.add(new Animal());
		readAnimals(animals);   //ok
		
		ArrayList<Dog> dogs = new ArrayList<Dog>();
		dogs.add(new Dog());
		dogs.add(new Dog());
		readAnimals(dogs);
		
		System.out.println("operations are completed.....");		
	}
	private static void readAnimals(List<? super Dog> animals) { //it can allows Animal data extended classes data(allows any sub type of Animal)
		animals.add(new Dog());
		
		//Read elements
		for(Object a : animals) {
			System.out.println(a);
		}
	}
}
/*
com.ramesh.genericTypes.Animal@1c655221
com.ramesh.genericTypes.Animal@ee7d9f1
com.ramesh.genericTypes.Dog@15615099
com.ramesh.genericTypes.Dog@1edf1c96
com.ramesh.genericTypes.Dog@368102c8
com.ramesh.genericTypes.Dog@6996db8
operations are completed.....
*/

