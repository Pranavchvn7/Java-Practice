package java_Practice;

import java.util.HashMap;
import java.util.Scanner;

public class StringCharacterCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s=sc.nextLine();
		sc.close();
		
		char[] ch=s.toCharArray();
		HashMap<Character, Integer> h=new HashMap<Character, Integer>();
		for(char c:ch) {
			if(h.containsKey(c)) {
				int x=h.get(c);
				h.put(c, x+1);
			}
			else {
				h.put(c, 1);
			}
		}
		System.out.println(h);
	}

}
