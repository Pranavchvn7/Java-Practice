package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {

	public static void main(String[] args) {

		//HashSet hs=new HashSet();  //default capacity:16, Load Factor: 0.75
		//HashSet hs=new HashSet(100, (float)0.95);//new capacity:100, load factor:0.95
		//HashSet<Integer> hs=new HashSet<Integer>(); //For homogenous elements
		
		HashSet hs=new HashSet();
		
		//add elements
		hs.add(100);
		hs.add(null);
		hs.add("Welcome");
		hs.add(true);
		hs.add(20);
		
		System.out.println(hs);// stored in random order, no indexing concept, uses hashcode 
								//as underlying Data Structure
		
		//remove elements
		hs.remove(20); //pass value as parameter, as indexing concept is not present in Set Interface
		System.out.println(hs);
		
		//contains
		System.out.println(hs.contains(true));
		
		//isEmpty
		System.out.println(hs.isEmpty());
		
		//reading values using for each loop
//		for(Object o:hs) {
//			System.out.println(o);
//		}
		
		//reading values using Iterator
		Iterator ir=hs.iterator();
		while(ir.hasNext()) {
			System.out.println(ir.next());
		}

	}

}
