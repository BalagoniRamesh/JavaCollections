package com.rameshsoft.list;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayLinkedListPerformanceComparison {
	public static void main(String[] args) {
		//Create an ArrayList
		ArrayList<Integer> arrayList = new ArrayList<>();
		//Add elements to the ArrayList
		for(int i = 0; i<100; i++)
		{
			arrayList.add(i);
		}
		//Measure the time taken to access elements in the ArrayList
		long arrayListStartTime = System.nanoTime();
		for(int i =0; i<arrayList.size(); i++)
		{
			int element = arrayList.get(i);
		}
		long arrayListEndTime =System.nanoTime();
		long arrayListExecutionTime = arrayListEndTime-arrayListStartTime;
		System.out.println("ArrayList execution time: "+ arrayListExecutionTime + " nanoseconds");
		
		//Create a LinkedList
		LinkedList<Integer> linkedList = new LinkedList<>();
		//Add elements to the LinkedList
		for(int i =0; i<100; i++)
		{
			linkedList.add(i);
		}
		//Measure the time taken to access elements in the LinkedList
		long linkedListStartTime = System.nanoTime();
		for(int i = 0; i < linkedList.size(); i++)
		{
			int element = linkedList.get(i);
		}
		long linkedListEndTime = System.nanoTime();
		long linkedListEexcutionTime = linkedListEndTime -linkedListStartTime;
		System.out.println("LinkedList execution time: "+ linkedListEexcutionTime + " nanoseconds");
		
	}

}
