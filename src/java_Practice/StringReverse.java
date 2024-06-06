package java_Practice;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s=sc.nextLine();
		sc.close();
		System.out.println("String before reverse: "+s);
		
//		String rev="";
//		for(int i=(s.length()-1);i>=0;i--) {
//			rev=rev+s.charAt(i);
//		}
//		System.out.println("String after reverse: "+rev);
		
		//Using StringBuffer
		StringBuffer sb=new StringBuffer(s);
		System.out.println(sb.reverse());
	}

}
