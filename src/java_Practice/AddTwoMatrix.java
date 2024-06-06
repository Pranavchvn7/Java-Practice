package java_Practice;

public class AddTwoMatrix {

	public static void main(String[] args) {
		int first[][]= {{1,2}, {5,10}, {2,6}};
		int second[][]= {{2,6}, {1,2}, {5,3}};
		
		//row count----------->(Array length is not a method so no circular brackets)
		int m=first.length;
		//column count
		int n=first[0].length;
		
		int sum[][]=new int[m][n];
		
		//sum of two arrays
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				sum[i][j]=first[i][j]+second[i][j];
			}
		}
		
		System.out.println("First Array: ");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(first[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println("Second Array: ");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(second[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println("Sum of Arrays: ");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(sum[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
