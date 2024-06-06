package collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueEx {

	public static void main(String[] args) {
		PriorityQueue pq=new PriorityQueue();
		//dulicats allowed
		//homogenois elements allowed only, throws ClassCastException
		//Insertion order preserved.
		
		//add() and offer() method
		pq.add("A");
		pq.add("B");
		pq.add("C");
		
		pq.offer("D");
		System.out.println(pq);
		
		//element() and peek() method
		System.out.println(pq.element());//returns head element if queue is empty throw NoSuchElementException
		
		System.out.println(pq.peek());//also returns head elements, throws null
		
		//remove() and poll() method
		System.out.println(pq.remove());//returns and removes head element, if queue is empty throws NoSuchElementException
		System.out.println(pq);
		
		System.out.println(pq.poll());//returns and removes head element if queue is empty throws null 

		//read queue elements
//		Iterator ir=pq.iterator();
//		while(ir.hasNext()) {
//			System.out.println(ir.next());
//		}
		
		for(Object o:pq) {
			System.out.println(o);
		}
	}

}
