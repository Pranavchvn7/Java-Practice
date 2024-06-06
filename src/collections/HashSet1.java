package collections;

import java.util.HashSet;

public class HashSet1 {

	public static void main(String[] args) {
		
		HashSet<Integer> evenNumbers=new HashSet<Integer>();
		
		evenNumbers.add(2);
		evenNumbers.add(4);
		evenNumbers.add(6);
		
		System.out.println(evenNumbers);
		
		HashSet numbers=new HashSet();
		
		//addAll
		numbers.addAll(evenNumbers);
		System.out.println(numbers);
		
		numbers.add(10);
		System.out.println(numbers);

		
		//removeAll
		numbers.removeAll(evenNumbers);
		System.out.println(numbers);
	}

}
