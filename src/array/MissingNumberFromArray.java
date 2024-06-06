package array;

public class MissingNumberFromArray {

	public static void main(String[] args) {
		// Array no need to be sorted.
		//numbers should be in range
		//no duplicates allowed
		
		int a[]=new int[] {1,2,3,4,6};
		int sum1=0, sum2=0;
		for(int i=0;i<a.length-1;i++) {
			sum1=sum1+a[i];
		}
		System.out.println("Sum of elemnets in array: "+sum1);
		
		for(int i=0;i<=5;i++) {
			sum2=sum2+i;
		}
		System.out.println("Sum of range of elemnets in array: "+sum2);
		
		System.out.println("Missing number from array is: "+(sum2-sum1));
	}

}
