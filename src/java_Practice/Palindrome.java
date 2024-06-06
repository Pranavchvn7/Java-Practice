package java_Practice;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		int n, temp, rev=0, rem;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		n=sc.nextInt();
		sc.close();
		temp=n;
		
		while(temp>0) {
			rem=temp%10;
			rev=(rev*10)+rem;
			temp=temp/10;
		}
		
		System.out.println("Reverse of given number is: "+rev);
		if(n==rev) {
			System.out.println("Given number is Palindrome number.");
		}
		else {
			System.out.println("Given number is not Palindrome number.");
		}
	}

}
