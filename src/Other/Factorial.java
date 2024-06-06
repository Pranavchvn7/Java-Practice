package Other;

public class Factorial {

	public static void main(String[] args) {
		System.out.println(factorial(5));

	}

	public static long factorial(int n) {
		if(n==1)
			return n;
		return n*factorial(n-1);
	}
}
//its updated now