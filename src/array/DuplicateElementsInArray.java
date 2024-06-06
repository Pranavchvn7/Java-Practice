package array;

import java.util.HashSet;

public class DuplicateElementsInArray {

	public static void main(String[] args) {
		//Approach 1
		int a []=new int[] {1,2,5,6,1,8,9,10,45};
		boolean flag=false;
		
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length-1;j++) {
				if(a[i]==a[j]) {
					System.out.println("Duplicate Element found..");
					flag=true;
					break;
				}
			}
		}
		if(flag==false) {
			System.out.println("DUplicate Elements not found..");
		}
		
		//Approach 2: Using HashSet
		boolean f=false;
		String s[]=new String[] {"java", "c++", "c", "paython", "java"};
		HashSet <String>hs=new HashSet<String>();
		
		for(String l:s) {
			if(hs.add(l)==false) {
				System.out.println("Duplicate Element found..");
				f=true;
			}
		}
		if(f==false) {
			System.out.println("Duplicate Element Not found..");
		}
	}

}
