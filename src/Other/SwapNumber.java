package Other;

public class SwapNumber {

	public static void main(String[] args) {
		int a=10, b=20, temp;
		
		//Using third variable
//		System.out.println("Before Swap: "+a+", "+b);
//		temp=a;
//		a=b;
//		b=temp;
//		System.out.println("After Swap: "+a+", "+b);
		
		//Without using third variable
		System.out.println("Before Swap: "+a+", "+b);
		a=a-b;
		b=a+b;
		a=b-a;
		System.out.println("After Swap: "+a+", "+b);
	}

}
