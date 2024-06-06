package Other;

public class PalindromeNumber {

	public static void main(String[] args) {
		int n=121, temp=n, rev=0, rem;
		
		while(temp!=0) {
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		
		if(n==rev) {
			System.out.println("Palindrome Number...");
		}
		else
			System.out.println("Not a Palindrome Number...");
	}
}
