package java_Practice;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s=sc.nextLine();
		sc.close();
		
		String rev="";
		for(int i=(s.length()-1);i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		
		if(s.equals(rev)) {
			System.out.println("Given String is Palindrome.");
		}
		else {
			System.out.println("Given String is Not Palindrome.");
		}
	}

}
