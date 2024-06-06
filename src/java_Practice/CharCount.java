package java_Practice;

import java.util.Scanner;

public class CharCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String: ");
		String s=sc.nextLine();
		sc.close();
		
		int lo=0, up=0, di=0, sch=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='a' && s.charAt(i)<='z') {
				lo++;
			}
			else if(s.charAt(i)>='A' && s.charAt(i)<='Z') {
				up++;
			}
			else if(s.charAt(i)>='0' && s.charAt(i)<='9') {
				di++;
			}
			else {
				sch++;
			}
		}
		
		System.out.println("Number of Lower case letters: "+lo);
		System.out.println("Number of Upper case letters: "+up);
		System.out.println("Number of Digits: "+di);
		System.out.println("Number of Special Characters: "+sch);
	}

}
