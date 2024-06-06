package java_Practice;

import java.util.Scanner;

public class ArrayMaximumNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int l=sc.nextInt();
		int[] a=new int[l];
		System.out.println("Enter array elements: ");
		for(int i=0;i<l;i++) {
			a[i]=sc.nextInt();
		}
		sc.close();
		
		int temp;
		for(int i=0;i<l;i++) {
			for(int j=0;j<l;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		System.out.print("Array after sorting: ");
		for(int i=0;i<l;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("Array third maximum element is: ");
	}

}
