package collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetEx {

	public static void main(String[] args) {
		//LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>();//Homogenious elements
		//LinkedHashSet lhs=new LinkedHashSet(100, (float)0.95);//new capacity and load factor
		LinkedHashSet lhs=new LinkedHashSet();
		
		//add elements
		lhs.add(100);
		lhs.add(null);
		lhs.add("Welcome");
		lhs.add(true);
		lhs.add(500);
		
		System.out.println(lhs);//insertion order preserved.
		
		//remove elements
		lhs.remove(500);
		System.out.println(lhs);
		
		//contains
		System.out.println(lhs.contains(100));

		//isEmpty()
		System.out.println(lhs.isEmpty());
		
		//reading values using for each loop
//		for(Object o:lhs) {
//			System.out.println(o);
//		}
		
		//reading values using Iterator
		Iterator ir=lhs.iterator();
		while(ir.hasNext()) {
			System.out.println(ir.next());
		}
	}

}
