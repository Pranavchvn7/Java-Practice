package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		//Declaration
		//Homogenous 
		//LinkedList<String> ll=new LinkedList<String>();
		LinkedList ll = new LinkedList();
		ll.add("123");
		ll.add("15.5");
		ll.add(null);
		ll.add(null);
		ll.add("true");
		System.out.println(ll);
		
		//add at index
		ll.add(1, "Pranav");
		System.out.println(ll);
		
		//remove
		ll.remove(1);
		System.out.println(ll);
		
		//get value
		System.out.println(ll.get(2));
		
		//set value
		ll.set(2, "Pranav");
		System.out.println(ll);
		
		//contains
		System.out.println(ll.contains("Pranav"));
		
		//isEmpty()
		System.out.println(ll.isEmpty());
		
		//Reading elements
		//for
//		

		//for each loop
//		for(Object o:ll) {
//			System.out.println(o);
//		}
		
		//Iterator
		Iterator it=ll.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
