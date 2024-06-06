package array;

import java.util.Arrays;

public class ArrayBinarySearch {

	public static void main(String[] args) {
		int a[]=new int[] {1,2,3,4,5,6,7,8,9,10}; //Array should be sorted
		int l=0,h=a.length-1,m;
		int key=8, flag=0;

		while(l<=h) {
			m=(l+h)/2;
			if(a[m]==key) {
				System.out.println("Element Found...");
				flag=1;
				break;
			}
			if(a[m]<key) {
				l=m+1;
			}
			if(a[m]>key) {
				h=m-1;
			}
		}
		if(flag==0) {
			System.out.println("Element not Found...");
		}
		
		//Approach 2: Arrays Binary Search
		
		System.out.println(Arrays.binarySearch(a, key));//Returns position of element from array
	}
}
