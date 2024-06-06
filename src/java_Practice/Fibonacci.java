package java_Practice;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		sc.close();
		
		System.out.println("Fibonacci series upto "+n+" is: ");
//		int first=0, second=1;
//		System.out.println(first);
//		System.out.println(second);
//		for(int i=2;i<n;i++) {
//			int sum=first+second;
//			System.out.println(sum);
//			first=second;
//			second=sum;
//		}
		
		int a=0, b=1, sum;
		for(int i=0;i<n;i++) {
			System.out.print(a+" ");
			sum=a+b;
			a=b;
			b=sum;
		}
	}

}
