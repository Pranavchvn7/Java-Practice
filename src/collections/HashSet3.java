package collections;

import java.util.HashSet;

public class HashSet3 {

	public static void main(String[] args) {
		
		HashSet<Integer> set1=new HashSet<Integer>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		System.out.println("HashSet1: "+set1);
		
		HashSet<Integer> set2=new HashSet<Integer>();
		set2.add(3);
		set2.add(4);
		set2.add(5);
		System.out.println("HashSet2: "+set2);
		
		//Union operation on set
		//set1.addAll(set2); //adds elements from set2 to set1, no duplicates [1, 2, 3, 4, 5]
		//System.out.println(set1);
		
		//Intersection operation on set
		set1.retainAll(set2); //removes from this collection all of its elements that are not contained in the specified collection.
		System.out.println(set1);
		
		//Subset of a set
		System.out.println(set1.containsAll(set2));

	}

}
