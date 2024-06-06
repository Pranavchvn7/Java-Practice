package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		
		al.add("A");
		al.add("J");
		al.add("I");
		al.add("L");
		al.add("c");
		
		//System.out.println(al);
		
		//add collection to ArrayList
		ArrayList dup_al=new ArrayList();
		
		dup_al.addAll(al);
		System.out.println(dup_al);
		
		//Collections class method
			System.out.println("Before Sort: "+al);
			Collections.sort(al);
			System.out.println("After Sort: "+al);
			
			//reverse order
			Collections.sort(al, Collections.reverseOrder());
			System.out.println("Reverse Order: "+al);
			
			//Shuffle
			Collections.shuffle(al);
			System.out.println("After Shuffle: "+al);
	}

}
