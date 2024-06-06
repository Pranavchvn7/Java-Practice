package array;

import java.util.Arrays;
import java.util.Collections;

public class ArraySort {

	public static void main(String[] args) {
		//int a[]=new int[] {10, 80, 50, 60, 40, 30};
		
		//print array as string
		//System.out.println("Array before sorting: "+Arrays.toString(a));
		
		//Sort array using parallel sort method from Arrays Class
		/*Arrays.parallelSort(a);
		System.out.println("Array after sorting: "+Arrays.toString(a));*/
		
		//Sort array using sort method from Arrays Class
		/*Arrays.sort(a);
		System.out.println("Array after sorting: "+Arrays.toString(a));*/
		
		//Sort array in descending order
		Integer a[]=new Integer[] {10, 80, 50, 60, 40, 30};
		System.out.println("Array before sorting: "+Arrays.toString(a));
		Arrays.sort(a, Collections.reverseOrder());
		System.out.println("Array after sorting: "+Arrays.toString(a));
	}
}

//int is a primitive type in which Collections will not work, 
//so we have to use Integer