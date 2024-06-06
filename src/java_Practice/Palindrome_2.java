package java_Practice;

import java.util.Scanner;

public class Palindrome_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		sc.close();
		
		System.out.println("Palindrome numbers upto "+n+" are: ");
		for(int i=0;i<n;i++) {
			int rem, rev=0, temp;
			
			temp=i;
			while(temp>0) {
				rem=temp%10;
				rev=(rev*10)+rem;
				temp=temp/10;
			}
			
			if(i==rev) {
				System.out.println(rev);
			}
		}
	}

}
