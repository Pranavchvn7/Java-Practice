package java_Practice;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		int n, temp1, digits=0, temp2, i;
		double amn=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		n=sc.nextInt();
		sc.close();
		
		//Counting digits of given number
		temp1=n;
		while(temp1>0) {
			temp1=temp1/10;
			digits++;
		}
		System.out.println("Number of digits are: "+digits);
		
		//Calculating Armstrong number
		//Syntax: Math.pow(number, toThePower); result must be stored in double.
		temp2=n;
		while(temp2>0) {
			i=temp2%10;
			amn=amn+(Math.pow(i, digits));
			temp2=temp2/10;
		}
		System.out.println("Armstrong number is: "+amn);
		
		//Condition check
		if(n==amn) {
			System.out.println("Given number is Amstrong number.");
		}
		else {
			System.out.println("Given number is not Amstrong number.");
		}
	}

}
