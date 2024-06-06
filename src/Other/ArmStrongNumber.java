package Other;

public class ArmStrongNumber {

	public static void main(String[] args) {
		int n=153; 
		double an=0;
		int temp=n, temp1=n, digits=0;
		
		while(temp!=0){
			digits++;
			temp=temp/10;
		}
		
		for(int i=0;i<digits;i++) {
			int rem=temp1%10;
			an=an + Math.pow(rem, digits);
			temp1=temp1/10;
			rem=0;
		}
		
		if(n==an) {
			System.out.println("Number is ArmStrong Number...");
		}
		else
			System.out.println("Number is Not a ArmStrong Number...");
	}
}
