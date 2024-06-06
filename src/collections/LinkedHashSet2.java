package collections;

import java.util.LinkedHashSet;

public class LinkedHashSet2 {

	public static void main(String[] args) {
		LinkedHashSet<Integer> lhs1=new LinkedHashSet<Integer>();
		
		lhs1.add(1);
		lhs1.add(2);
		lhs1.add(3);
		lhs1.add(4);
		lhs1.add(5);
		System.out.println("LinkedHashSet1: "+lhs1);
		
		LinkedHashSet<Integer> lhs2=new LinkedHashSet<Integer>();
		
		lhs2.add(3);
		lhs2.add(4);
		lhs2.add(5);
		System.out.println("LinkedHashSet2: "+lhs2);
		
		//Union
		lhs1.addAll(lhs2);
		System.out.println(lhs1);
		
		//Intersection
		lhs1.retainAll(lhs2);
		System.out.println(lhs1);
		
		//subset
		System.out.println(lhs1.containsAll(lhs2));
	}

}
