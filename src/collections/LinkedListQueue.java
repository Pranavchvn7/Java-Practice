package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class LinkedListQueue {

	public static void main(String[] args) {
		LinkedList llq=new LinkedList();
		//dulicats allowed
		//heterogenious elements allowed.
		//Insertion order prerved.
		
		//add() and offer() method
		llq.add("A");
		llq.add("B");
		llq.add("C");
		llq.add(100);
		
		llq.offer(null);
		llq.offer(null);
		System.out.println(llq);
		
		//element() and peek() method
		System.out.println(llq.element());//returns head element if queue is empty throw NoSuchElementException
		
		System.out.println(llq.peek());//also returns head elements, throws null
		
		//remove() and poll() method
		System.out.println(llq.remove());//returns and removes head element, if queue is empty throws NoSuchElementException
		System.out.println(llq);
		
		System.out.println(llq.poll());//returns and removes head element if queue is empty throws null 
		System.out.println(llq);
		
		//read queue elements
		Iterator ir=llq.iterator();
		while(ir.hasNext()) {
			System.out.println(ir.next());
		}
		
//		for(Object o:llq) {
//			System.out.println(o);
//		}

	}

}
