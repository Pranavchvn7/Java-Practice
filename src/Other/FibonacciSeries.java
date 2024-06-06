package Other;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a=0, b=1, c=1;
		int n=5;
		
		System.out.print("Fibonacci Series: ");
		for(int i=0;i<n;i++) {	
			System.out.print(a+" ");
			a=b;
			b=c;
			c=a+b;
		}
	System.out.print("PrintFibonacciRecursive: ");
		for(int i=0;i<n;i++) {
			System.out.print(PrintFibonacciRecursive(i)+"   ");
		}
	}

	public static int PrintFibonacciRecursive(int count){
		if(count<=1)
			return count;
		return PrintFibonacciRecursive(count-1)+PrintFibonacciRecursive(count-2);
	}
}
