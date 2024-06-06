package collections;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList<Integer>();
		
		ll.add(100);
		ll.add(500);
		ll.add(800);
		ll.add(98);
		ll.add(5);
		
		System.out.println(ll);
		
		//Collections Class method
		System.out.println("Before Sorting: "+ll);
		Collections.sort(ll);
		System.out.println("After Sorting: "+ll);
		
		//Reverse
		Collections.sort(ll, Collections.reverseOrder());
		System.out.println("After reverse: "+ll);
		
		//special methods
		ll.addFirst(1);
		ll.addLast(999);
		System.out.println(ll);
		
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);

	}

}
