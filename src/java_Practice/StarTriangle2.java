package java_Practice;

import java.util.Scanner;

public class StarTriangle2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length: ");
		int l=sc.nextInt();
		sc.close();
		
		for(int i=0; i<l;i++) {
			for(int j=l;j>i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
