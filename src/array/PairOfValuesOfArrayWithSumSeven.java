package array;

import java.util.Scanner;

public class PairOfValuesOfArrayWithSumSeven {

	public static void main(String[] args) {
		int s; 
		System.out.println("Enter array size");
		Scanner sc = new Scanner(System.in);
		s = sc.nextInt();
		int []a = new int[s];
		
		for(int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		System.out.print("Array: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.print("Pair of values with sum 7: ");
		for(int j=0;j<a.length;j++) {
			for(int k=j+1;k<a.length;k++) {
				if((a[j]+a[k])==7) {
					System.out.print("("+a[j]+", "+a[k]+")");
				}
			}
		}
		sc.close();
	}

}
