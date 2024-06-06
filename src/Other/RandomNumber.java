package Other;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		Random r=new Random();
		
		//Shows random number between lowest and highest integer value
		System.out.println(r.nextInt());
		
		//Shows random number between lowest 0 value and Highest value 50
		System.out.println(r.nextInt(50));
		
		//Shows random number between lowest 50 value and Highest value 500
		System.out.println(r.nextInt(50, 500));
	}

}
