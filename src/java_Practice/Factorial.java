package java_Practice;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int num, f=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		num=sc.nextInt();
		sc.close();
		
		for(int i=1;i<=num;i++) {
			f=f*i;
		}
		System.out.println("Factorial of given number is: "+f);
	}

}
