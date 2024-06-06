package array;

import java.util.Arrays;

public class EqalityOfTwoArrays {

	public static void main(String[] args) {
		int a[]=new int[] {1,2,3,6,4,5};
		int b[]=new int[] {1,2,3,4,5};
		
		//Approach 1
		boolean flag=Arrays.equals(a, b);
		if(flag==true) {
			System.out.println("Arrays are Equal..");
		}
		else
			System.out.println("Arrays are Not Equal..");
		
		//Approach 2
		boolean f=true;
		if(a.length==b.length) {
			for(int i=0;i<a.length;i++) {
				if(a[i]!=b[i]) {
					System.out.println("Arrays are Not Equal..");
					f=false;
					break;
				}
			}
		}
		else {
			System.out.println("Arrays are Not Equal..");
			f=false;
		}
		
		if(f==true) {
			System.out.println("Arrays are Equal..");
		}
	}
}
