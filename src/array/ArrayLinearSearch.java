package array;

public class ArrayLinearSearch {

	public static void main(String[] args) {
		int a[]=new int[] {10,20,30,50,80,70};
		int search_ele=500;
		boolean flag=false;
		
		for(int i=0;i<a.length-1;i++) {
			if(a[i]==search_ele) {
				System.out.println("Element found at position: "+i);
				flag=true;
				break;
			}
		}
		if(flag==false){
			System.out.println("Element not Found...");
		}
	}

}
