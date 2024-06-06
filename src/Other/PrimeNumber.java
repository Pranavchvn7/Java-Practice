package Other;

public class PrimeNumber {

	public static void main(String[] args) {
		int n=6;
		boolean f=true;
		if(n==0 || n==1)
			f=false;
		for(int i=2;i<=(n/2);i++) {
			if(n%i==0) {
				f=false;
			}
		}
		
		if(f==true)
			System.out.println("Prime Number");
		else
			System.out.println("Not a Prime Number");
	}
}
