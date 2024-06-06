package java_Practice;

import java.util.Scanner;

public class ReverseTheNumber {

	public static void main(String[] args) {
		int n, rev=0, rem;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		n=sc.nextInt();
		sc.close();
		
		while(n>0) {
			rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
		}
		System.out.println("Reverse of given number is: "+rev);
	}

}
