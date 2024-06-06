package java_Practice;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		Random r=new Random();
		System.out.println("Random number upto 50.");
		System.out.println(r.nextInt(50));
		
		//Using Math.random() method
		System.out.println((int)(Math.random()*50));
	}

}
