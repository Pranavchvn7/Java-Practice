package array;

import java.util.Arrays;

public class ArraySortBubbleSort {

	public static void main(String[] args) {
		int a[] = new int[] {4,8,2,1,7,9};
		int n=a.length,temp;
		
		System.out.println("Array before sort: "+Arrays.toString(a));
		
		for(int i=0;i<n-1;i++) {	//Number of passes
			for(int j=0;j<n-1;j++) {//Number of iterations in each pass
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		System.out.println("Array after sort: "+Arrays.toString(a));
	}

}
