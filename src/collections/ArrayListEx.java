package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListEx {

	public static void main(String[] args) {
		
		//Declaration
		//For all type of elements
		//ArrayList al=new ArrayList();
		//For homogenious Elements
		ArrayList<String> al = new ArrayList<String>();
		
		//add elements
		al.add("Pranav");
		al.add("Pranav");
		al.add(null);
		al.add("2000");
		al.add("Sagar");
		
		System.out.println(al);
		
		//add at spec, index
		al.add(3, "3000");
		System.out.println(al);
		
		//Size
		System.out.println(al.size());
		
		//get
		System.out.println(al.get(2));
		
		//set
		al.set(1, "abc");
		System.out.println(al);
		
		//remove using index
		al.remove(1);
		System.out.println(al);
		
		//remove using value
		al.remove("2000");
		System.out.println(al);
		
		//contains
		System.out.println(al.contains("Pranav"));
		
		//isEmpty()
		System.out.println(al.isEmpty());
		
		//clear
//		al.clear();
//		System.out.println(al);
		
		//Read elements using
		//for loop
//		for(int i=0; i<al.size();i++) {
//			System.out.println(al.get(i));
//		}
		
		//for each loop
//		for(String s:al) {
//			System.out.println(s);
//		}
		
		//using Iterator
		Iterator ir=al.iterator();
		while(ir.hasNext()) {
			System.out.println(ir.next());
		}
	}

}
//List interface is child interface of Collection interface.
//List interface is implemented by classes: ArrayList, LinkedList, Vector
//Duplicates are allowed in list,Allows any number of null value, Here order of insertion is maintained.
//Default capacity of arraylist is 10.
//Arraylist is resizable.
//Manipulation with Arraylist is slow because it internally uses an array. 
//If any element is removed or added in the array, all the other bits are shifted in the memory. So its a worst choice for manipulation operation.
//Best choice for retrieval operation.