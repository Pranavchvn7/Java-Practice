package java_Practice;

import java.util.Scanner;

public class Armstrong_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		sc.close();
		
		System.out.println("Armstrong numbers upto "+n+" are: ");
		for(int i=0;i<n;i++) {
			int temp1, temp2, digits=0, rem;
			double am=0;
			
			temp1=i;
			while(temp1>0) {
				temp1=temp1/10;
				digits++;
			}
			
			temp2=i;
			while(temp2>0) {
				rem=temp2%10;
				am=am+(Math.pow(rem, digits));
				temp2=temp2/10;
			}
			
			if(i==am) {
				System.out.println(am);
			}
		}
	}
}
