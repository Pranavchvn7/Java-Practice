package java_Practice;

import java.util.Scanner;

public class BiggestOfFourNumbers {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter four numbers: ");
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			int d=sc.nextInt();
			sc.close();
			System.out.println("Entered numbers are: ");
			System.out.println(a+", "+b+", "+c+", "+d);
			
			if(a>b && a>c && a>d) {
				System.out.println("Biggest number is: "+a);
			}
			else if(b>a && b>c && b>d) {
				System.out.println("Biggest number is: "+b);
			}
			else if(c>a && c>b && c>d) {
				System.out.println("Biggest number is: "+c);
			}
			else if(d>a && d>b && d>c) {
				System.out.println("Biggest number is: "+d);
			}
	}

}
