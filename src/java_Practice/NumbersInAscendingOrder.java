package java_Practice;

import java.util.Scanner;

public class NumbersInAscendingOrder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number of elements: ");
		int n=sc.nextInt();
		int[] na=new int[n];
		System.out.println("Enter all elements: ");
		for(int i=0;i<n;i++) {
			na[i]=sc.nextInt();
		}
		sc.close();
		
		int temp;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(na[i]<na[j]) {
					temp=na[i];
					na[i]=na[j];
					na[j]=temp;
				}
			}
		}
		
		System.out.println("Ascending order: ");
		for(int i=0;i<n;i++) {
			System.out.println(na[i]);
		}
	}

}
