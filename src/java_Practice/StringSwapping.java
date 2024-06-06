package java_Practice;

public class StringSwapping {

	public static void main(String[] args) {
		String s1="Hello";
		String s2="World";

		//Swap String without using third variable
		
		
		System.out.println("Before Swapping: ");
		System.out.println(s1);
		System.out.println(s2);
		//1) append s1 and s2
		s1=s1+s2;
		
		//2) Store initial String s1 in s2
		s2=s1.substring(0, s1.length()-s2.length());
		
		//3) Store initial String s2 in s1
		s1=s1.substring(s2.length());
		
		System.out.println("After Swapping: ");
		System.out.println(s1);
		System.out.println(s2);
	}

}
