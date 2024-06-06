package java_Practice;

import java.util.Scanner;

public class SwapWithutThirdVeriable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number: ");
		int n1=sc.nextInt();
		System.out.println("Enter second number: ");
		int n2=sc.nextInt();
		sc.close();
		System.out.println("Numbers before swap: ");
		System.out.println("First:"+n1+" Second:"+n2);
		
//		n1=n1+n2;
//		n2=n1-n2;
//		n1=n1-n2;
		
		n1=n1*n2;
		n2=n1/n2;
		n1=n1/n2;
		
		System.out.println("Numbers after swap: ");
		System.out.println("First:"+n1+" Second:"+n2);
	}

}
