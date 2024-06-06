package collections;

import java.util.LinkedHashSet;

public class LinkedHashSet1 {

	public static void main(String[] args) {
		LinkedHashSet<Integer> evenNumbers=new LinkedHashSet<Integer>();
		
		evenNumbers.add(2);
		evenNumbers.add(4);
		evenNumbers.add(6);
		
		System.out.println(evenNumbers);
		
		LinkedHashSet<Integer> numbers=new LinkedHashSet<Integer>();
		numbers.add(10);

		//addAll
		evenNumbers.addAll(numbers);
		System.out.println(evenNumbers);
		
		//removeAll
		evenNumbers.removeAll(numbers);
		System.out.println(evenNumbers);
	}

}
