package java_Practice;

import java.util.Arrays;

public class ArraySortingUsingMethod {

	public static void main(String[] args) {
		String s[]= {"z", "d", "a", "b"};
		
		Arrays.sort(s);
		
		for(String sr:s) {
			System.out.print(sr);
		}
		
		System.out.println();
		int i[]= {10,50,80,-70,5,-100};
		Arrays.sort(i);
		
		for(int in:i) {
			System.out.print(in);
		}
	}

}
