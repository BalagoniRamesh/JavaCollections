package com.ramesh.genericTypes;
//this functionality Wildcard(?) from java 8 version
import java.util.ArrayList;
import java.util.List;
class Animal{
	
}
class Dog extends Animal{	
}
class Cat extends Animal{	
}


class MyClass {

	public static void main(String[] args) {
		List<Animal> animals = new ArrayList<Animal>();
		animals.add(new Animal());
		readAnimals(animals);   //ok
		
		List<Dog> dogs = new ArrayList<Dog>();
		dogs.add(new Dog());
		readAnimals(dogs);
		
		List<Cat> cats = new ArrayList<Cat>();
		cats.add(new Cat());
		readAnimals(cats);
		
		System.out.println("operations are completed.....");		
	}
	private static void readAnimals(List<? extends Animal> animals) { //it can allows Animal data extended classes data(allows any sub type of Animal)
		//animals.add(new Cat()); //C.E, we can't add new data
		//animals.add(new Dog());
		
		//Read elements
		for(Animal a : animals) {
			System.out.println(a);
		}
	}
}
/*
com.ramesh.genericTypes.Animal@aec6354
com.ramesh.genericTypes.Dog@ee7d9f1
com.ramesh.genericTypes.Cat@1edf1c96
operations are completed.....
Note: By default genirics are non ploymorphic, we can make polymorphic by using Wildcard(?) symbol
*/
