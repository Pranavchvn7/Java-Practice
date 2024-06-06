package java_Practice;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n=sc.nextInt();
		sc.close();
		
		boolean f=false;
		for(int i=2;i<(n/2);i++) {
			if(n%i==0) {
				f=true;
			}
		}
		
		if(f==false) {
			System.out.println("Given number is Prime number.");
		}
		else {
			System.out.println("Given number is Not a Prime number.");
		}
	}

}
